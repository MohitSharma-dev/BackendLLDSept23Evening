package ParkingLot.controllers;

import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.Gate;
import ParkingLot.models.Operator;
import ParkingLot.models.Ticket;
import ParkingLot.models.Vehicle;

public class TicketController {

    IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO request){
        IssueTicketResponseDTO response = new IssueTicketResponseDTO();
        response.setResponseStatus(ResponseStatus.SUCCESS);
        return response;
    }
}

// DTO : Data Transfer Object