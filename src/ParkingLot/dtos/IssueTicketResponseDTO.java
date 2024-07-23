package ParkingLot.dtos;

public class IssueTicketResponseDTO {
    private int ticketId;
    private int parkingSlotNumber;
    private ResponseStatus responseStatus;

    public int getParkingSlotNumber() {
        return parkingSlotNumber;
    }

    public void setParkingSlotNumber(int parkingSlotNumber) {
        this.parkingSlotNumber = parkingSlotNumber;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

	@Override
	public String toString() {
		return "Ticket: [ticketId=" + ticketId + ", parkingSlotNumber=" + parkingSlotNumber
				+ ", responseStatus=" + responseStatus + "]";
	}
    
    

}
