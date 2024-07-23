package ParkingLot.strategies;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import ParkingLot.models.Ticket;
import ParkingLot.models.VehicleType;

public class HourlyPriceCalculatorStrategy implements PriceCalculatorStrategy {
	Map<VehicleType, Integer> priceChart;

	public HourlyPriceCalculatorStrategy() {
		priceChart = new HashMap<>();
		priceChart.put(VehicleType.BIKE, 20);
	}

	@Override
	public int calculatePrice(Ticket ticket) {
		long hrs = (new Date().getTime() - ticket.getEntryTime().getTime()) / 36000000;
		int pricePerhr = priceChart.get(ticket.getVehicle().getVehicleType());
		return hrs <= 0 ? pricePerhr : (int) hrs * pricePerhr;
	}
}
