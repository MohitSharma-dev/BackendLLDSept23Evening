package ParkingLot.models;

import java.util.List;

public class ParkingFloor extends BaseModel {
    private String floorName;
    private List<ParkingSlot> parkingSlots;
    private ParkingFloorStatus parkingFloorStatus;
    private List<VehicleTypeCapacity> vehicleCapacities;

    public ParkingFloor() {
    	parkingFloorStatus=ParkingFloorStatus.OPEN;
		parkingSlots=List.of(new ParkingSlot(1,1,ParkingSlotStatus.EMPTY,VehicleType.BIKE),new ParkingSlot(2,2,ParkingSlotStatus.EMPTY,VehicleType.BIKE),new ParkingSlot(3,3,ParkingSlotStatus.EMPTY,VehicleType.BIKE));
	}
    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public List<VehicleTypeCapacity> getVehicleCapacities() {
        return vehicleCapacities;
    }

    public void setVehicleCapacities(List<VehicleTypeCapacity> vehicleCapacities) {
        this.vehicleCapacities = vehicleCapacities;
    }
}
