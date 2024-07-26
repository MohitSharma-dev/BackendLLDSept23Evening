package ParkingLot.Repositories;

import ParkingLot.models.ParkingSlot;

import java.util.HashMap;

public class ParkingSlotRepository {
    HashMap<String, ParkingSlot> parkingSlots = new HashMap<String, ParkingSlot>();
    public  int parkingSlotId=0;

    public ParkingSlot SaveParkingSlot(ParkingSlot parkingSlot){
        parkingSlotId++;
        parkingSlot.setId(parkingSlotId);
        parkingSlots.put(parkingSlot.getParkingSlotId(), parkingSlot);
        return parkingSlot;
    }
}
