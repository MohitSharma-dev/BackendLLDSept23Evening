package ParkingLot.models;

public class Vehicle extends  BaseModel {
    private String vehicleNumber;
    private String ownerName;
    private AllowedVehicleType vehicleType;


    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public AllowedVehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(AllowedVehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
