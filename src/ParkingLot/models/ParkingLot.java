package ParkingLot.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParkingLot extends BaseModel{
    private String name;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> entryGates;
    private List<Gate> exitGates;
    // capacity
    private List<VehicleTypeCapacity> vehicleCapacities;
    private ParkingLotStatus parkingLotStatus;
    private SlotAssignmentStrategyType slotAssignmentStrategyType;
    // you can create a separate class of address
//    private String address;

    public ParkingLot(){
        parkingFloors = new ArrayList<>();
        name = "New Parking Lot";
        vehicleCapacities = new ArrayList<>();
        parkingLotStatus = ParkingLotStatus.OPEN;
        slotAssignmentStrategyType = SlotAssignmentStrategyType.RANDOM;
    }

    public SlotAssignmentStrategyType getSlotAssignmentStrategyType() {
        return slotAssignmentStrategyType;
    }

    public void setSlotAssignmentStrategyType(SlotAssignmentStrategyType slotAssignmentStrategyType) {
        this.slotAssignmentStrategyType = slotAssignmentStrategyType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(List<Gate> entryGates) {
        this.entryGates = entryGates;
    }

    public List<Gate> getExitGates() {
        return exitGates;
    }

    public void setExitGates(List<Gate> exitGates) {
        this.exitGates = exitGates;
    }

    public List<VehicleTypeCapacity> getVehicleCapacities() {
        return vehicleCapacities;
    }

    public void setVehicleCapacities(List<VehicleTypeCapacity> vehicleCapacities) {
        this.vehicleCapacities = vehicleCapacities;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }
}

// all the classes are going to have some common
// id
// created_at
// modified_at