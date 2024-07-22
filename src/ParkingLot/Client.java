package ParkingLot;

import ParkingLot.controllers.TicketController;
import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.models.Gate;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.service.TicketService;

public class Client {
    public static void main(String[] args) {
        VehicleRepository vehicleRepository = new VehicleRepository();
        TicketRepository ticketRepository = new TicketRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        GateRepository gateRepository = new GateRepository();

        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                parkingLotRepository,
                ticketRepository
        );

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequestDTO request = new IssueTicketRequestDTO();
        request.setGateId(1);
        request.setOwnerName("Mohit");
        request.setVehicleType(VehicleType.AUTO);
        request.setVehicleNumber("DL 1VC 0001");
        request.setParkingLotId(1);

        ticketController.issueTicket(request);
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