package ParkingLot;

import ParkingLot.controllers.BillController;
import ParkingLot.controllers.PaymentController;
import ParkingLot.controllers.TicketController;
import ParkingLot.dtos.BillRequestDTO;
import ParkingLot.dtos.BillResponseDTO;
import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.dtos.PaymentDTO;
import ParkingLot.models.PaymentMode;
import ParkingLot.models.PaymentStatus;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.BillRepository;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.repositories.PaymentRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.service.BillService;
import ParkingLot.service.PaymentService;
import ParkingLot.service.TicketService;

public class Client {
	public static void main(String[] args) {
		VehicleRepository vehicleRepository = new VehicleRepository();
		TicketRepository ticketRepository = new TicketRepository();
		ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
		GateRepository gateRepository = new GateRepository();

		TicketService ticketService = new TicketService(gateRepository, vehicleRepository, parkingLotRepository,
				ticketRepository);

		TicketController ticketController = new TicketController(ticketService);

		IssueTicketRequestDTO request1 = new IssueTicketRequestDTO(1, "DL 1VC 0001", "Mohit", VehicleType.BIKE, 1);
		IssueTicketRequestDTO request2 = new IssueTicketRequestDTO(1, "OD 33M 0243", "Surajit", VehicleType.BIKE, 1);
		IssueTicketResponseDTO ticket1 = ticketController.issueTicket(request1);
		IssueTicketResponseDTO ticket2 = ticketController.issueTicket(request2);
		System.out.println(ticket1);
		System.out.println(ticket2);
		BillRepository billRepository = new BillRepository();
		BillService billService = new BillService(billRepository, ticketRepository, gateRepository,
				parkingLotRepository);
		BillController billController = new BillController(billRepository, ticketRepository, gateRepository,
				parkingLotRepository);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		BillResponseDTO bill = billController.generateBill(new BillRequestDTO(ticket1.getTicketId(), 2, 1));
		System.out.println(bill);
		PaymentRepository paymentRepository = new PaymentRepository();
		PaymentService paymentService = new PaymentService(paymentRepository);
		PaymentController paymentController = new PaymentController(paymentService);
		PaymentStatus status = paymentController
				.PaymentProcessing(new PaymentDTO(bill.getAmount() / 2, PaymentMode.CASH));
		System.out.println("Payment " + bill.getAmount() / 2 + " " + status + " via " + PaymentMode.CASH);
		status = paymentController.PaymentProcessing(new PaymentDTO(bill.getAmount() / 2, PaymentMode.UPI));
		System.out.println("Payment " + bill.getAmount() / 2 + " " + status + " via " + PaymentMode.UPI);

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