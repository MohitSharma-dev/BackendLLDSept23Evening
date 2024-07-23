package ParkingLot.repositories;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

import ParkingLot.models.Vehicle;

public class VehicleRepository {

	private Map<String, Vehicle> vehicles = new TreeMap<>();
	private int idIncrementor = 0;

	public Optional<Vehicle> findVehicleByVehicleNumber(String vehicleNumber) {
		return Optional.ofNullable(vehicles.get(vehicleNumber));
	}

	public Vehicle save(Vehicle vehicle) {
		// save this to db
		idIncrementor++;
		vehicle.setId(idIncrementor);
		vehicles.put(vehicle.getLicensePlate(), vehicle);
		return vehicle;
	}
}
