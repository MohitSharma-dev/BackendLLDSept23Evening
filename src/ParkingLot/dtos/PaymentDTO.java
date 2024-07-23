package ParkingLot.dtos;

import ParkingLot.models.PaymentMode;

public class PaymentDTO {
	private int amount;
	private PaymentMode mode;
	
	public PaymentDTO() {
	}
	
	public PaymentDTO(int amount, PaymentMode mode) {
		super();
		this.amount = amount;
		this.mode = mode;
	}


	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public PaymentMode getMode() {
		return mode;
	}
	public void setMode(PaymentMode mode) {
		this.mode = mode;
	}
	
}
