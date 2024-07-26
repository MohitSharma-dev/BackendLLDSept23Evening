package ParkingLot.dtos;

import ParkingLot.models.Gate;
import ParkingLot.models.ParkingLot;
import ParkingLot.models.ParkingSlot;
import ParkingLot.models.Vehicle;

import java.util.Date;

public class IssueTicketResponseDTO {

   private int ticketId;
   private String  parkingSlotNumber;
   private ResponseStatus responseStatus;

   public String getParkingSlotNumber() {
      return parkingSlotNumber;
   }

   public void setParkingSlotNumber(String parkingSlotNumber) {
      this.parkingSlotNumber = parkingSlotNumber;
   }

   public int getTicketId() {
      return ticketId;
   }

   public void setTicketId(int ticketId) {
      this.ticketId = ticketId;
   }

   public ResponseStatus getResponseStatus() {
      return responseStatus;
   }

   public void setResponseStatus(ResponseStatus responseStatus) {
      this.responseStatus = responseStatus;
   }


}
