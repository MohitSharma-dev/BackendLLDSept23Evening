package ParkingLot.adapter;

import ParkingLot.models.Bill;
import ParkingLot.models.PaymentStatus;

public class RazorPayPaymentAdapter implements PaymentAdaptor {

	@Override
	public PaymentStatus processPayment(Bill bill) {
		System.out.println("Payment SUCCESSFUL for bill ID : "+ bill.getId());
		return PaymentStatus.SUCCESS;
	}
}
