package ParkingLot.models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private Date exitTime;
    private Ticket ticket;
    private int amount;
    private Gate gate;
    private Operator operator;
    private List<Payment> payment;
    // there can be partial payments
    // Cash : 20 , UPI : 30
    // AmazonPay : 20 , CC : 50
    public Bill(Ticket ticket, int amount, Gate gate, Operator operator) {
        this.ticket = ticket;
        this.amount = amount;
        this.gate = gate;
        this.operator = operator;
    }


    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "exitTime=" + exitTime +
                ", ticket=" + ticket +
                ", amount=" + amount +
                ", gate=" + gate +
                ", operator=" + operator +
                ", payment=" + payment +
                '}';
    }
}

// double amount
// 1.0000000001 == 0.99999999 : true
// double float : stores approximations
// 30.45  3045