package ParkingLot.Repositories;

import ParkingLot.models.Ticket;

import java.util.HashMap;

public class TicketRepository {
 HashMap<Integer, Ticket> tickets = new HashMap<>();
 int ticketID = 0;

 public Ticket save(Ticket ticket) {
     ticketID+=1;
     ticket.setId(ticketID);
     tickets.put(ticketID, ticket);
     return ticket;
 }
}
