package ParkingLot;

import ParkingLot.controllers.TicketController;
import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.models.Gate;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.*;
import ParkingLot.service.TicketService;

public class Client {
    public static void main(String[] args) {
        VehicleRepository vehicleRepository = new VehicleRepository();
        TicketRepository ticketRepository = new TicketRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        GateRepository gateRepository = new GateRepository();
        OperatorRepository operatorRepository = new OperatorRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        ParkingSlotRepository parkingSlotRepository = new ParkingSlotRepository();

        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                parkingLotRepository,
                ticketRepository,
                parkingSlotRepository,
                operatorRepository,
                parkingFloorRepository
        );

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequestDTO request = new IssueTicketRequestDTO();
        request.setGateId(1);
        request.setOwnerName("Mohit");
        request.setVehicleType(VehicleType.AUTO);
        request.setVehicleNumber("DL 1VC 0001");
        request.setParkingLotId(1);

        IssueTicketResponseDTO responseDTO = ticketController.issueTicket(request);

        System.out.println("Response --> \n"+
                "getParkingSlotNumber -- "+responseDTO.getParkingSlotNumber() +
                "\n getTicketId -- "+responseDTO.getTicketId());
    }
}

// Controllers
// Services
// Repository

// C <- S <- R

// Generate the ticket : CRUD : Ticket : TicketController

// Gathered requirement
// class diagram
// schema design
// code models
// code controller
    // DTO
// Issue ticket completion

// HW : Generating the bill , check-out