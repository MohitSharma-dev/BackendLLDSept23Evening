package ParkingLot.controllers;

import ParkingLot.dtos.PaymentDTO;
import ParkingLot.models.Payment;
import ParkingLot.models.PaymentStatus;
import ParkingLot.service.PaymentService;

public class PaymentController {

	PaymentService paymentService;

	public PaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public PaymentStatus PaymentProcessing(PaymentDTO paymentDto) {
		Payment p = paymentService.processPayment(paymentDto);
		return p.getPaymentStatus();
	}
}
