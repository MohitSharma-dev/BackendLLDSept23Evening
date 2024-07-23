package ParkingLot.models;

import java.util.Date;

public class ParkingSlot extends BaseModel {
	private int slotNumber;
	private ParkingSlotStatus parkingSlotStatus;
	private VehicleType vehicleType;
	private ParkingFloor parkingFloor;

	public ParkingSlot() {
	}

	public ParkingSlot(int id, int slotNumber, ParkingSlotStatus parkingSlotStatus, VehicleType vehicleType) {
		this.setId(id);
		this.setCreatedAt(new Date());
		this.setUpdatedAt(new Date());
		this.slotNumber = slotNumber;
		this.parkingSlotStatus = parkingSlotStatus;
		this.vehicleType = vehicleType;
	}

	public ParkingFloor getParkingFloor() {
		return parkingFloor;
	}

	public void setParkingFloor(ParkingFloor parkingFloor) {
		this.parkingFloor = parkingFloor;
	}

	public int getSlotNumber() {
		return slotNumber;
	}

	public void setSlotNumber(int slotNumber) {
		this.slotNumber = slotNumber;
	}

	public ParkingSlotStatus getParkingSlotStatus() {
		return parkingSlotStatus;
	}

	public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
		this.parkingSlotStatus = parkingSlotStatus;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
}
