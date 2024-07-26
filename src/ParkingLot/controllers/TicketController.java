package ParkingLot.Controllers;

import ParkingLot.Services.TicketService;
import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.Ticket;


public class TicketController {
    TicketService ticketService = null;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO issueTicketRequestDTO) {
        IssueTicketResponseDTO issueTicketResponseDTO = new IssueTicketResponseDTO();

        try{
            Ticket ticket =  ticketService.issueTicket(issueTicketRequestDTO.getGateNumber(),
                    issueTicketRequestDTO.getVehicleNumber(),
                    issueTicketRequestDTO.getVehicleType(),
                    issueTicketRequestDTO.getOwnerName(),
                    issueTicketRequestDTO.getParkingLotId());

            issueTicketResponseDTO.setTicketId(ticket.getId());
            issueTicketResponseDTO.setParkingSlotNumber(ticket.getParkingSlot().getParkingSlotId());
            issueTicketResponseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        }
       catch (RuntimeException e){
           issueTicketResponseDTO.setResponseStatus(ResponseStatus.FAILED);
       }
        return  issueTicketResponseDTO;
    }
}
