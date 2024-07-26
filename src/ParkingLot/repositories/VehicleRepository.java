package ParkingLot.Repositories;

import ParkingLot.models.Vehicle;

import java.util.HashMap;
import java.util.Optional;

public class VehicleRepository {
    HashMap<String, Vehicle> vehicles = new HashMap<>();
    public static int vehicleID=0;

    public Optional<Vehicle> findVehicleByVehicleNumber(String vehicleNumber) {
        if(vehicles.containsKey(vehicleNumber)) {
            return Optional.ofNullable(vehicles.get(vehicleNumber));
        }
        return Optional.empty();
    }


    public Vehicle save(Vehicle vehicle){
        vehicleID+=1;
        vehicle.setId(vehicleID);
        vehicles.put(vehicle.getVehicleNumber(), vehicle);
        return vehicle;
    }
}
