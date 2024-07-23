package ParkingLot.strategies;

import ParkingLot.models.Ticket;

public interface PriceCalculatorStrategy {

	int calculatePrice(Ticket ticket);
}
