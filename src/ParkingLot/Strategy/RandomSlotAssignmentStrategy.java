package ParkingLot.Strategy;

import ParkingLot.models.*;

public class RandomSlotAssignmentStrategy implements SlotAssignmentStrategy{
    @Override
    public ParkingSlot FindParkingSlot(ParkingLot parkingLot, AllowedVehicleType vehicleType) {
        for(ParkingFloor parkingFloor : parkingLot.getParkingFloors()){
            for(ParkingSlot parkingSlot : parkingFloor.getParkingSlots()){
                if(parkingSlot.getAllowedVehicleType().equals(vehicleType) && parkingSlot.getParkingSlotStatus().equals(ParkingSlotStatus.EMPTY)){
                    return parkingSlot;
                }
            }
        }

        return null;
    }
}
