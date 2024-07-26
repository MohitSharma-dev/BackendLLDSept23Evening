package ParkingLot.models;

import java.util.Date;

public class Payment extends BaseModel{
    private String referenceNumber;
    private Date paymentDate;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private  float amount;
}
