package ParkingLot.Strategy;

import ParkingLot.models.AllowedVehicleType;
import ParkingLot.models.ParkingLot;
import ParkingLot.models.ParkingSlot;

public interface SlotAssignmentStrategy {
    public ParkingSlot FindParkingSlot(ParkingLot parkingLot, AllowedVehicleType vehicleType);
}
