package ParkingLot.service;

import java.util.Date;
import java.util.Optional;

import ParkingLot.models.Gate;
import ParkingLot.models.GateType;
import ParkingLot.models.ParkingLot;
import ParkingLot.models.ParkingSlot;
import ParkingLot.models.ParkingSlotStatus;
import ParkingLot.models.Ticket;
import ParkingLot.models.Vehicle;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.strategies.SlotAssignmentStrategyFactory;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(
            GateRepository gateRepository,
            VehicleRepository vehicleRepository,
            ParkingLotRepository parkingLotRepository,
            TicketRepository ticketRepository
    ){
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }
    public Ticket issueTicket(
            int gateId,
            String vehicleNumber,
            String ownerName,
            VehicleType vehicleType,
            int parkingLotId
    ){
        // 1. create the ticket obj
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> gateOptional = gateRepository.findGateById(gateId);
        if(gateOptional.isEmpty()){
            throw new RuntimeException("Gate not found");
        }
        Gate gate = gateOptional.get();
        if(!gate.getGateType().equals(GateType.ENTRY)) {
        	throw new RuntimeException("Hello "+ownerName +"! You are at Exit Gate");
        }
        ticket.setGate(gate);
        ticket.setOperator(gate.getCurrentOperator());

        Optional<Vehicle> vehicleOptional = vehicleRepository.findVehicleByVehicleNumber(vehicleNumber);
        Vehicle vehicle;
        if(vehicleOptional.isEmpty()){
            vehicle = new Vehicle();
            vehicle.setVehicleType(vehicleType);
            vehicle.setOwnerName(ownerName);
            vehicle.setLicensePlate(vehicleNumber);
            vehicle = vehicleRepository.save(vehicle);
        } else {
            vehicle = vehicleOptional.get();
        }
        ticket.setVehicle(vehicle);
        // 2. Assignment of Slot
        Optional<ParkingLot> parkingLotOptional = parkingLotRepository.findParkingLotById(parkingLotId);
        if(parkingLotOptional.isEmpty()){
            throw new RuntimeException("Parking Lot not found");
        }
        ParkingLot parkingLot = parkingLotOptional.get();
        // Multiple different ways : Random , nearest , farthest.
        // 3. Return
        ParkingSlot parkingSlot =
                 SlotAssignmentStrategyFactory
                 .getSlotAssignmentStrategyByType(parkingLot.getSlotAssignmentStrategyType())
                 .assignSlot(parkingLot , vehicleType);

        ticket.setParkingSlot(parkingSlot);
        // update the capacity if required
        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.FILLED);
        return ticketRepository.save(ticket);
    }
}
