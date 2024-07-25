package ParkingLot.repositories;

import ParkingLot.models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class VehicleRepository {
    
    static Map<String,Vehicle> vehicleDb = new TreeMap<>();
    static int idCounter = 0;

    public Optional<Vehicle> findVehicleByVehicleNumber(String vehicleNumber){
        if(!vehicleDb.containsKey(vehicleNumber))
            return Optional.empty();
        return Optional.of(vehicleDb.get(vehicleNumber));
    }

    public Vehicle save(Vehicle vehicle){
        // save this to db
        vehicle.setId(idCounter++);
        vehicle.setOwnerName(vehicle.getOwnerName());
        vehicle.setLicensePlate(vehicle.getLicensePlate());
        vehicle.setVehicleType(vehicle.getVehicleType());
        vehicleDb.put(vehicle.getLicensePlate(),vehicle);
        return vehicle;
    }
}
