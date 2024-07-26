package ParkingLot.models;

public class VehicleTypeCapacity {
    private AllowedVehicleType vehicleType;
    private int capacity;

    public AllowedVehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(AllowedVehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
