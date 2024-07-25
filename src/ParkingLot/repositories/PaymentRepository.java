package ParkingLot.repositories;

import java.util.Map;
import java.util.TreeMap;

import ParkingLot.models.Payment;
import ParkingLot.models.PaymentStatus;

public class PaymentRepository {

	private Map<Integer, Payment> payments = new TreeMap<>();
	private int previousId = 0;

	public Payment save(Payment payment) {
		previousId += 1;
		payment.setId(previousId);
		payments.put(payment.getId(), payment);
		payment.setPaymentStatus(PaymentStatus.SUCCESS);
		return payment;
	}

}
