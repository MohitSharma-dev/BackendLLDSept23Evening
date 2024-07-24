package ParkingLot.service;

import ExceptionHandling.D;
import ParkingLot.models.*;
import ParkingLot.repositories.*;
import ParkingLot.strategies.SlotAssignmentStrategyFactory;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;
    private ParkingSlotRepository parkingSlotRepository;
    private OperatorRepository operatorRepository;
    private ParkingFloorRepository parkingFloorRepository;


    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository,
                         ParkingSlotRepository parkingSlotRepository, OperatorRepository operatorRepository, ParkingFloorRepository parkingFloorRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
        this.parkingSlotRepository = parkingSlotRepository;
        this.operatorRepository = operatorRepository;
        this.parkingFloorRepository = parkingFloorRepository;
    }

    public Ticket issueTicket(
            int gateId,
            String vehicleNumber,
            String ownerName,
            VehicleType vehicleType,
            int parkingLotId
    ) {
        // 1. create the ticket obj
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> gateOptional = gateRepository.findGateById(gateId);
        if (gateOptional.isEmpty()) {
            throw new RuntimeException("Gate not found");
        }
        Gate gate = gateOptional.get();

        System.out.println("Gate fetched --");

        /********************************************/
        //Vehicle
        Optional<Vehicle> vehicleOptional = vehicleRepository.getVehicleByNumber(vehicleNumber);
        Vehicle vehicle;
        if (vehicleOptional.isEmpty()) {
            vehicle = new Vehicle();
            vehicle.setVehicleType(vehicleType);
            vehicle.setOwnerName(ownerName);
            vehicle.setLicensePlate(vehicleNumber);
            vehicle = vehicleRepository.saveVehicle(vehicle);
        } else {
            vehicle = vehicleOptional.get();
        }
        ticket.setVehicle(vehicle);
        /********************************************/
        //adding Operators
        Optional<Operator> optionalOperator = operatorRepository.getOperatorById(1);
        if (optionalOperator.isEmpty()) {
            throw new RuntimeException("Operator not found");
        }
        gate.setCurrentOperator(optionalOperator.get());
        ticket.setGate(gate);
        ticket.setOperator(gate.getCurrentOperator());

        /********************************************/
        // add ParkingLot Data
        Optional<ParkingLot> parkingLotOptional = parkingLotRepository.findParkingLotById(parkingLotId);
        if (parkingLotOptional.isEmpty()) {
            throw new RuntimeException("Parking Lot not found");
        }
        ParkingLot parkingLot = parkingLotOptional.get();

        /********************************************/
        // add parkingSlot data

        Optional<List<ParkingSlot>> optionalParkingSlots = parkingSlotRepository.getAvailableSlots();
        if (optionalParkingSlots.isEmpty()) {
            throw new RuntimeException("Parking Floors not found");
        }
        List<ParkingSlot> parkingSlots = optionalParkingSlots.get();

        /********************************************/
        //add floorsData
        Optional<List<ParkingFloor>> optionalParkingFloors = parkingFloorRepository.getAvailableFloors();
        if (optionalParkingFloors.isEmpty()) {
            throw new RuntimeException("Parking Floors not found");
        }

        List<ParkingFloor> parkingFloorsList = optionalParkingFloors.get();

        for (ParkingFloor parkingFloor : parkingFloorsList) {
            parkingFloor.setParkingSlots(parkingSlots);
        }
        parkingLot.setParkingFloors(parkingFloorsList);

        // Multiple different ways : Random , nearest , farthest.
        // 3. Return
        ParkingSlot parkingSlot =
                SlotAssignmentStrategyFactory
                        .getSlotAssignmentStrategyByType(parkingLot.getSlotAssignmentStrategyType())
                        .assignSlot(parkingLot, vehicleType);

        ticket.setParkingSlot(parkingSlot);
        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.FILLED);
        return ticketRepository.save(ticket);
    }
}
