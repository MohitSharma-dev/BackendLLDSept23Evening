package ParkingLot.dtos;

import ParkingLot.models.VehicleType;

public class IssueTicketRequestDTO {
    private int gateId;
    private String vehicleNumber;
    private String ownerName;
    private VehicleType vehicleType;
    private int parkingLotId;
    
    public IssueTicketRequestDTO() {
	}

    public IssueTicketRequestDTO(int gateId, String vehicleNumber, String ownerName, VehicleType vehicleType,
			int parkingLotId) {
		super();
		this.gateId = gateId;
		this.vehicleNumber = vehicleNumber;
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.parkingLotId = parkingLotId;
	}

	public int getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public int getGateId() {
        return gateId;
    }

    public void setGateId(int gateId) {
        this.gateId = gateId;
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

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
