package ParkingLot.service;

import java.util.Date;
import java.util.UUID;

import ParkingLot.dtos.PaymentDTO;
import ParkingLot.models.Payment;
import ParkingLot.repositories.PaymentRepository;

public class PaymentService {
	PaymentRepository paymentRepository;
	public PaymentService(PaymentRepository paymentRepository) {
		this.paymentRepository=paymentRepository;
	}
	
	public Payment processPayment(PaymentDTO payment) {
		return paymentRepository.save(new Payment(payment.getAmount(),payment.getMode(),UUID.randomUUID().toString(),new Date()));
	}

}
