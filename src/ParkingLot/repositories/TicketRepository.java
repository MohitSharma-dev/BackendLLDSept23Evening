package ParkingLot.repositories;

import ParkingLot.models.Ticket;

import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {
   private static Map<Integer, Ticket> tickets = new TreeMap<>();
   private static int previousId = 0;
   public Ticket save(Ticket ticket){
       // the diff both the objects are the id
       previousId += 1;
       ticket.setId(previousId);
       tickets.put(ticket.getId(), ticket);
       return ticket;
   }


}
