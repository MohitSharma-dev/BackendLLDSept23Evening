package ParkingLot.controllers;

import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.Gate;
import ParkingLot.models.Operator;
import ParkingLot.models.Ticket;
import ParkingLot.models.Vehicle;
import ParkingLot.service.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO request){
        IssueTicketResponseDTO response = new IssueTicketResponseDTO();

        try{
            Ticket ticket = ticketService.issueTicket(
                    request.getGateId(),
                    request.getVehicleNumber(),
                    request.getOwnerName(),
                    request.getVehicleType(),
                    request.getParkingLotId()
            );
            response.setTicketId(ticket.getId());
            response.setParkingSlotNumber(ticket.getParkingSlot().getSlotNumber());
            response.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e){
            response.setResponseStatus(ResponseStatus.FAILURE);
        }
        return response;
    }
}

// DTO : Data Transfer Object

// business logic
// service