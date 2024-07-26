package ParkingLot.models;
import  java.util.List;

public class ParkingFloor extends  BaseModel{
    private String parkingFloorName;
    private List<AllowedVehicleType> allowedVehicleTypes;
    private List<ParkingSlot> parkingSlots;
    private ParkingFloorStatus parkingFloorStatus;
    private List<VehicleTypeCapacity> vehicleTypeCapacity;

    public String getParkingFloorName() {
        return parkingFloorName;
    }

    public void setParkingFloorName(String parkingFloorName) {
        this.parkingFloorName = parkingFloorName;
    }

    public List<AllowedVehicleType> getAllowedVehicleTypes() {
        return allowedVehicleTypes;
    }

    public void setAllowedVehicleTypes(List<AllowedVehicleType> allowedVehicleTypes) {
        this.allowedVehicleTypes = allowedVehicleTypes;
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

    public List<VehicleTypeCapacity> getVehicleTypeCapacity() {
        return vehicleTypeCapacity;
    }

    public void setVehicleTypeCapacity(List<VehicleTypeCapacity> vehicleTypeCapacity) {
        this.vehicleTypeCapacity = vehicleTypeCapacity;
    }
}
