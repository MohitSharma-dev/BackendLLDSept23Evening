package ParkingLot.models;

public class ParkingSlot extends  BaseModel{
    private String parkingSlotId;
    private AllowedVehicleType allowedVehicleType;
    private ParkingSlotStatus parkingSlotStatus;
    private Vehicle Vehicle;
    private ParkingFloor parkingFloor;

    public String getParkingSlotId() {
        return parkingSlotId;
    }

    public void setParkingSlotId(String parkingSlotId) {
        this.parkingSlotId = parkingSlotId;
    }

    public AllowedVehicleType getAllowedVehicleType() {
        return allowedVehicleType;
    }

    public void setAllowedVehicleType(AllowedVehicleType allowedVehicleType) {
        this.allowedVehicleType = allowedVehicleType;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public Vehicle getVehicle() {
        return Vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        Vehicle = vehicle;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
