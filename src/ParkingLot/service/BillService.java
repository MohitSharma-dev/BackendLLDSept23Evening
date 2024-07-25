package ParkingLot.service;

import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.Bill;
import ParkingLot.models.Gate;
import ParkingLot.models.Ticket;
import ParkingLot.models.Vehicle;
import ParkingLot.repositories.BillRepository;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.strategies.AmountCalculationStrategy;

import java.util.Optional;

public class BillService {
    private  TicketRepository ticketRepository;
    private  BillRepository billRepository;
    private  GateRepository gateRepository;
    private AmountCalculationStrategy amountCalculationStrategy;

    public BillService(TicketRepository ticketRepository, BillRepository billRepository, GateRepository gateRepository) {
       this.ticketRepository = ticketRepository;
        this.billRepository = billRepository;
        this.gateRepository = gateRepository;
        this.amountCalculationStrategy = new AmountCalculationStrategy();
    }
    public Bill generateBill(IssueTicketResponseDTO responseDTO, int durationInHours, int exitGateId) {
        if(responseDTO.getResponseStatus()== ResponseStatus.FAILURE){
            return null;
        }
        Optional<Ticket> ticketOptional = ticketRepository.findById(responseDTO.getTicketId());
        Ticket ticket;
        ticket = ticketOptional.orElseGet(Ticket::new);
        int amount = getAmount(ticket.getVehicle(), durationInHours);
        Optional<Gate> gateOptional = gateRepository.findGateById(exitGateId);
        Gate gate = gateOptional.orElseGet(Gate::new);
        return new Bill(ticket,amount,gate,gate.getCurrentOperator());
    }

    private int getAmount(Vehicle vehicle, int durationInHours) {
        if(vehicle==null) return 0;
        return amountCalculationStrategy.getAmount(vehicle.getVehicleType(),durationInHours);
    }
}
