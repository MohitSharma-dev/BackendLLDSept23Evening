package ParkingLot.repositories;

import ParkingLot.models.Vehicle;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class VehicleRepository {
    private Map<String, Vehicle> vehicles = new TreeMap<>();

    public Vehicle saveVehicle(Vehicle vehicle)
    {
        vehicles.put(vehicle.getLicensePlate(),vehicle);
        return vehicle;
    }
    public Optional<Vehicle> getVehicleByNumber(String vehicleNumber)
    {
        if(vehicles.containsKey(vehicleNumber))
        {
            return Optional.of(vehicles.get(vehicleNumber));
        }

        return Optional.empty();
    }
}
