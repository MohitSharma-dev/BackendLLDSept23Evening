package ParkingLot.repositories;

import ParkingLot.models.Vehicle;

import java.util.Optional;

public class VehicleRepository {
    public Optional<Vehicle> findVehicleByVehicleNumber(String vehicleNumber){
        return Optional.empty();
    }

    public Vehicle save(Vehicle vehicle){
        // save this to db
        vehicle.setId(1);
        return vehicle;
    }
}
