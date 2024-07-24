package ParkingLot.models;

public class VehicleTypeCapacity {
    private VehicleType vehicleType;
    private int capacity;

    public VehicleTypeCapacity(VehicleType vehicleType, int capacity) {
        this.vehicleType = vehicleType;
        this.capacity = capacity;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
