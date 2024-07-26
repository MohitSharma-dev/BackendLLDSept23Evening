package ParkingLot.Repositories;

import ParkingLot.models.AllowedVehicleType;
import ParkingLot.models.ParkingFloor;
import ParkingLot.models.VehicleTypeCapacity;

import java.util.ArrayList;
import java.util.HashMap;

public class ParkingFloorVehicleTypeCapacityRepository {
    HashMap<String, HashMap<AllowedVehicleType,Integer>> vehicleTypeCapacities=
            new HashMap<>();

   public void LoadData(String parkingFloorName, ArrayList<VehicleTypeCapacity> vehicleTypes) {
       for(VehicleTypeCapacity vehicleTypeCapacity : vehicleTypes) {
           HashMap<AllowedVehicleType,Integer> hm = new HashMap<AllowedVehicleType,Integer>();

       }
   }

    public int getVehicleTypeCapacity(String parkingFloorId, AllowedVehicleType allowedVehicleType) {
        HashMap<AllowedVehicleType,Integer> vehicleTypeCapacity = vehicleTypeCapacities.get(parkingFloorId);
        if(vehicleTypeCapacity.containsKey(allowedVehicleType)) {
            return vehicleTypeCapacity.get(allowedVehicleType);
        }
       return 0;
    }

    public void Save(String parkingFloorId, AllowedVehicleType allowedVehicleType) {

        HashMap<AllowedVehicleType,Integer> vehicleTypeCapacity = vehicleTypeCapacities.get(parkingFloorId);
        vehicleTypeCapacity.put(allowedVehicleType,  vehicleTypeCapacity.getOrDefault(allowedVehicleType,0) + 1);
    }



}
