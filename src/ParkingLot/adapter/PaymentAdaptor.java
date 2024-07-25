package ParkingLot.adapter;

import ParkingLot.models.Bill;
import ParkingLot.models.PaymentStatus;

public interface PaymentAdaptor {
	PaymentStatus processPayment(Bill bill);
}
