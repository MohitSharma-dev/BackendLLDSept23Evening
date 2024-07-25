package ParkingLot.service;

import java.util.Optional;

import ParkingLot.dtos.BillRequestDTO;
import ParkingLot.models.Bill;
import ParkingLot.models.Gate;
import ParkingLot.models.GateType;
import ParkingLot.models.ParkingLot;
import ParkingLot.models.Ticket;
import ParkingLot.repositories.BillRepository;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.repositories.TicketRepository;

public class BillService {

	BillRepository billRepository;
	TicketRepository ticketRepository;
	GateRepository gateRepository;
	ParkingLotRepository parkingLotRepository;

	public BillService(BillRepository billRepository, TicketRepository ticketRepository, GateRepository gateRepository,
			ParkingLotRepository parkingLotRepository) {
		super();
		this.billRepository = billRepository;
		this.ticketRepository = ticketRepository;
		this.gateRepository = gateRepository;
		this.parkingLotRepository = parkingLotRepository;
	}

	public Bill generateBill(BillRequestDTO billDto) {
		Optional<Ticket> tOptional = ticketRepository.getTicketById(billDto.getTicketId());
		if (tOptional.isEmpty()) {
			throw new RuntimeException("Ticket Not found in Repo..");
		}
		Ticket ticket = tOptional.get();

		Optional<Gate> gOptional = gateRepository.findGateById(billDto.getGateId());
		if (gOptional.isEmpty()) {
			throw new RuntimeException("Gate Not found in Repo..");
		}
		Gate gate = gOptional.get();
		if (!gate.getGateType().equals(GateType.EXIT)) {
			throw new RuntimeException("This is not exit Gate..");
		}
		int amount = getBillAmount(ticket, billDto.getParkingLotId());
		Bill bill = new Bill(ticket, gate, gate.getCurrentOperator(), amount);
		return billRepository.save(bill);
	}

	private int getBillAmount(Ticket ticket, int parkingLotId) {
		Optional<ParkingLot> parkingLotOptional = parkingLotRepository.findParkingLotById(parkingLotId);
		if (parkingLotOptional.isEmpty()) {
			throw new RuntimeException("Parking Lot not found");
		}
		ParkingLot parkingLot = parkingLotOptional.get();
		return parkingLot.getPriceCalculatorStrategy().calculatePrice(ticket);
	}

}
