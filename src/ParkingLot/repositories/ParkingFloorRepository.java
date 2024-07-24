package ParkingLot.repositories;

import ParkingLot.models.Operator;
import ParkingLot.models.ParkingFloor;
import ParkingLot.models.ParkingFloorStatus;

import java.util.*;

public class ParkingFloorRepository {

    public Map<Integer, ParkingFloor> parkingFloors = new TreeMap<>();

    public ParkingFloorRepository()
    {
        ParkingFloor parkingFloor = new ParkingFloor();
        parkingFloor.setFloorName("F1");
        parkingFloor.setParkingFloorStatus(ParkingFloorStatus.OPEN);
        parkingFloor.setId(1);
        parkingFloors.put(parkingFloor.getId(),parkingFloor);

    }

    public Optional<ParkingFloor> getParkingFloorById(int id)
    {
        if(parkingFloors.containsKey(id)){
            return Optional.of(parkingFloors.get(id));
        }
        return Optional.empty();
    }

    public Optional<List<ParkingFloor>> getAvailableFloors()
    {
        return Optional.of(new ArrayList<>(parkingFloors.values()));
    }
}
