package ParkingLot.controllers;

import java.util.List;

import ParkingLot.dtos.BillRequestDTO;
import ParkingLot.dtos.BillResponseDTO;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.Bill;
import ParkingLot.repositories.BillRepository;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.service.BillService;
import ParkingLot.service.PaymentService;

public class BillController {

	BillService billService;

	public BillController(BillRepository billRepository, TicketRepository ticketRepository,
			GateRepository gateRepository, ParkingLotRepository parkingLotRepository) {
		billService = new BillService(billRepository, ticketRepository, gateRepository, parkingLotRepository);
	}

	public BillResponseDTO generateBill(BillRequestDTO billRequest) {
		Bill bill = billService.generateBill(billRequest);
		return new BillResponseDTO(bill.getId(),billRequest.getTicketId(), ResponseStatus.SUCCESS, bill.getAmount(),bill.getTicket().getEntryTime(), bill.getExitTime());
	}

}
