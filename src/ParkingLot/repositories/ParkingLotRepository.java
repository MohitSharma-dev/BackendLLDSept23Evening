package ParkingLot.Repositories;

import ParkingLot.models.ParkingLot;

import java.util.HashMap;
import java.util.Optional;

public class ParkingLotRepository {
    HashMap<Integer, ParkingLot> parkingLots = new HashMap<>();
    int parkingLotId=0;

    public Optional<ParkingLot> getParkingLotByID(int id) {
        if(parkingLots.containsKey(id)) {
           return Optional.ofNullable(parkingLots.get(id));
        }
        return Optional.empty();
    }

    public void save(ParkingLot parkingLot) {
        parkingLotId+=1;
        parkingLot.setId(parkingLotId);
        parkingLots.put(parkingLotId, parkingLot);
    }
}
