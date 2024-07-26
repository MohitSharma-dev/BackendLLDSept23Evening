package ParkingLot.Services;

import ParkingLot.Repositories.GateRepository;
import ParkingLot.Repositories.ParkingLotRepository;
import ParkingLot.Repositories.TicketRepository;
import ParkingLot.Repositories.VehicleRepository;
import ParkingLot.Strategy.SlotAssignmentFactory;
import ParkingLot.models.*;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository,
                  VehicleRepository vehicleRepository,
                  ParkingLotRepository parkingLotRepository,
                  TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(String gateNumber, String vehicleNumber,
                       AllowedVehicleType allowedVehicleType, String ownerName, int parkingLotId) {
//        1.create Ticket
//        2.Assign slot
//        3.return ticket

        Ticket ticket = new Ticket();

        //Gate
        Optional<Gate> gateOptional = gateRepository.getGateByGateNumber(gateNumber);
        Gate gate;
        if(gateOptional.isEmpty()) {
         throw new IllegalArgumentException("Gate not found");
        }
        gate = gateOptional.get();
        ticket.setGate(gate);
        ticket.setEntryTime(new Date());

        //Vehicle
        Optional<Vehicle> vehicleOptional = vehicleRepository.findVehicleByVehicleNumber(vehicleNumber);
        Vehicle vehicle ;
        if(vehicleOptional.isEmpty()) {
            vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setOwnerName(ownerName);
            vehicle.setVehicleType(allowedVehicleType);
            vehicle =  vehicleRepository.save(vehicle);
        }else{
            vehicle = vehicleOptional.get();
        }
        ticket.setVehicle(vehicle);

        //Assign Slot

        Optional<ParkingLot> parkingLotOptional = parkingLotRepository.getParkingLotByID(parkingLotId);
        ParkingLot parkingLot ;
        if(parkingLotOptional.isEmpty()) {
           throw new IllegalArgumentException("ParkingLot not found");
        }

        parkingLot = parkingLotOptional.get();

        //find the slot now
        ParkingSlot parkingSlot = SlotAssignmentFactory.
                getSlotAssignmentStrategy(parkingLot.getParkingSlotAssignmentStrategyType())
                .FindParkingSlot(parkingLot,allowedVehicleType);
        if(parkingSlot == null) {
            throw new RuntimeException("ParkingSlot not found");
        }

        ticket.setParkingSlot(parkingSlot);
        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.FILLED);
        parkingSlot.setVehicle(vehicle);

        //update vehicle capacity in floor and lot
        ParkingFloor parkingFloor = parkingSlot.getParkingFloor();
        VehicleTypeCapacity vehicleTypeCapacity = new VehicleTypeCapacity();

        return ticketRepository.save(ticket);


    }
}
