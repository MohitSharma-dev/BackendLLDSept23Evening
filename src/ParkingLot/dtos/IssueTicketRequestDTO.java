package ParkingLot.dtos;


import ParkingLot.models.AllowedVehicleType;

public class IssueTicketRequestDTO {
    private String gateNumber;
    private String vehicleNumber;
    private String ownerName;
    private AllowedVehicleType vehicleType;
    private int parkingLotId;

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

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

    public int getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }
}
