package ParkingLot.repositories;

import ParkingLot.models.Gate;
import ParkingLot.models.ParkingLot;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class ParkingLotRepository {
    private static final Map<Integer, ParkingLot> parkingLots = new TreeMap<>();
    private static int idCounter = 1;
    public ParkingLotRepository() {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setId(idCounter++);
        parkingLots.put(parkingLot.getId(), parkingLot);
    }

    public ParkingLot findParkingLotByGate(Gate gate){
        for(ParkingLot parkingLot : parkingLots.values()){
            for(Gate gate1 : parkingLot.getEntryGates()){
                if(gate1.getId() == gate.getId()){
                    return parkingLot;
                }
            }
        }
        return null;
    }

    public Optional<ParkingLot> findParkingLotById(int parkingLotId){
        if(parkingLots.containsKey(parkingLotId)){
            return Optional.of(parkingLots.get(parkingLotId));
        }
        return Optional.empty();
    }
}

// Gate , Vehicle
// slot : vehicleType , availableSlots : Floors : ParkingLot

// you can design API better