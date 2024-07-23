package ParkingLot.dtos;

import java.util.Date;

public class BillResponseDTO {
	int billId;
	int ticketId;
	ResponseStatus billStatus;
	int amount;
	Date entryTime;
	Date exitTime;
	public BillResponseDTO() {
		// TODO Auto-generated constructor stub
	}
	public BillResponseDTO(int billId,int ticketId, ResponseStatus billStatus, int amount, Date entryTime,Date exitTime) {
		super();
		this.billId = billId;
		this.ticketId=ticketId;
		this.billStatus = billStatus;
		this.amount = amount;
		this.entryTime=entryTime;
		this.exitTime = exitTime;
	}
	@Override
	public String toString() {
		return "Bill: [billId=" + billId + ", ticketId=" + ticketId + ", billStatus=" + billStatus
				+ ", amount=" + amount + ", entryTime=" + entryTime + ", exitTime=" + exitTime + "]";
	}
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public ResponseStatus getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(ResponseStatus billStatus) {
		this.billStatus = billStatus;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}
	public Date getExitTime() {
		return exitTime;
	}
	public void setExitTime(Date exitTime) {
		this.exitTime = exitTime;
	}
	
	
	
	
	
	
	
}
