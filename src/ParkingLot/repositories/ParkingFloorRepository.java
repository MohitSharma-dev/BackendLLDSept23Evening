package ParkingLot.Repositories;

import ParkingLot.models.ParkingFloor;

import java.util.HashMap;

public class ParkingFloorRepository {
    HashMap<String, ParkingFloor> parkingFloors = new HashMap<String, ParkingFloor>();
    int parkingFloorID =0;

    public ParkingFloor Save(ParkingFloor parkingFloor) {
        parkingFloorID+=1;
        parkingFloor.setId(parkingFloorID);
        parkingFloors.put(parkingFloor.getParkingFloorName(),parkingFloor);
        return parkingFloor;
    }
}
