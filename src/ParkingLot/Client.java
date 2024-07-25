package ParkingLot;

import ParkingLot.controllers.TicketController;
import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.models.Bill;
import ParkingLot.models.Gate;
import ParkingLot.models.GateType;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.*;
import ParkingLot.service.BillService;
import ParkingLot.service.TicketService;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleRepository vehicleRepository = new VehicleRepository();
        TicketRepository ticketRepository = new TicketRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        GateRepository gateRepository = new GateRepository();
        BillRepository billRepository = new BillRepository();

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
        request.setVehicleType(VehicleType.CAR);
        request.setVehicleNumber("DL 1VC 0001");
        request.setParkingLotId(1);

        IssueTicketResponseDTO responseDTO = ticketController.issueTicket(request);
        System.out.println("Ticket Issued : "+responseDTO);


        BillService billService = new BillService(ticketRepository,billRepository,gateRepository);
        int durationInHours = sc.nextInt();
        int exitGateId = 2;
        Gate gate = new Gate(2,"Ex-G1", GateType.EXIT);
        gateRepository.save(gate);
        Gate gte = gateRepository.findGateById(exitGateId).get();
        Bill bill  = billService.generateBill(responseDTO,durationInHours,exitGateId);
        System.out.println(bill);
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