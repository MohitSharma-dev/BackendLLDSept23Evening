package ParkingLot.dtos;

import java.util.List;

public class BillRequestDTO {
	int ticketId;
	int gateId;
	int parkingLotId;
	public BillRequestDTO(int ticketId, int gateId, int parkingLotId) {
		super();
		this.ticketId = ticketId;
		this.gateId = gateId;
		this.parkingLotId = parkingLotId;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getGateId() {
		return gateId;
	}
	public void setGateId(int gateId) {
		this.gateId = gateId;
	}
	public int getParkingLotId() {
		return parkingLotId;
	}
	public void setParkingLotId(int parkingLotId) {
		this.parkingLotId = parkingLotId;
	}
}
