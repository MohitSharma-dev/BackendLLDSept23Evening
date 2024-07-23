package ParkingLot.repositories;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

import ParkingLot.models.Ticket;

public class TicketRepository {
	private static Map<Integer, Ticket> tickets = new TreeMap<>();
	private static int previousId = 0;

	public Ticket save(Ticket ticket) {
		// the diff both the objects are the id
		previousId += 1;
		ticket.setId(previousId);
		tickets.put(ticket.getId(), ticket);
		return ticket;
	}

	public Optional<Ticket> getTicketById(int id) {
		return Optional.ofNullable(tickets.get(id));
	}
}
