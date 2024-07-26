package ParkingLot.models;
import java.util.List;
import ParkingLot.Strategy.SlotAssignmentStrategy;

public class ParkingLot extends  BaseModel{

    private String location;
    private List<AllowedVehicleType> allowedVehicleTypes;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> entryGateList;
    private List<Gate> exitGateList;
    private List<VehicleTypeCapacity> vehicleTypeCapacities;
    private SlotAssignmentStrategyType parkingSlotAssignmentStrategyType;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<AllowedVehicleType> getAllowedVehicleTypes() {
        return allowedVehicleTypes;
    }

    public void setAllowedVehicleTypes(List<AllowedVehicleType> allowedVehicleTypes) {
        this.allowedVehicleTypes = allowedVehicleTypes;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getEntryGateList() {
        return entryGateList;
    }

    public void setEntryGateList(List<Gate> entryGateList) {
        this.entryGateList = entryGateList;
    }

    public List<Gate> getExitGateList() {
        return exitGateList;
    }

    public void setExitGateList(List<Gate> exitGateList) {
        this.exitGateList = exitGateList;
    }

    public List<VehicleTypeCapacity> getVehicleTypeCapacities() {
        return vehicleTypeCapacities;
    }

    public void setVehicleTypeCapacities(List<VehicleTypeCapacity> vehicleTypeCapacities) {
        this.vehicleTypeCapacities = vehicleTypeCapacities;
    }

    public SlotAssignmentStrategyType getParkingSlotAssignmentStrategyType() {
        return parkingSlotAssignmentStrategyType;
    }

    public void setParkingSlotAssignmentStrategyType(SlotAssignmentStrategyType parkingSlotAssignmentStrategyType) {
        this.parkingSlotAssignmentStrategyType = parkingSlotAssignmentStrategyType;
    }
}
