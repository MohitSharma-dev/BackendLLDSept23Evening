package ParkingLot.models;

public class Gate extends BaseModel{
    private String gateNumber;
    private GateType gateType;
    private Operator currentOperator;
    private GateStatus gateStatus;

    public Gate() {
    }
    public Gate(int id,String gateNumber, GateType gateType) {
        this.setId(id);
        this.gateNumber = gateNumber;
        this.gateType = gateType;
        this.currentOperator = new Operator("Operator-1");
        this.gateStatus = GateStatus.OPEN;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Operator getCurrentOperator() {
        return currentOperator;
    }

    public void setCurrentOperator(Operator currentOperator) {
        this.currentOperator = currentOperator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    @Override
    public String toString() {
        return "Gate{" +
                "gateNumber='" + gateNumber + '\'' +
                ", gateType=" + gateType +
                ", currentOperator=" + currentOperator +
                ", gateStatus=" + gateStatus +
                '}';
    }
}
