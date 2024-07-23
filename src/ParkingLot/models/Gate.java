package ParkingLot.models;

import java.util.Date;

public class Gate extends BaseModel {
	private String gateNumber;
	private GateType gateType;
	private Operator currentOperator;
	private GateStatus gateStatus;

	public Gate() {
	}

	public Gate(int id, String gateNumber, GateType gateType, Operator currentOperator, GateStatus gateStatus) {
		this.setId(id);
		this.setCreatedAt(new Date());
		this.setUpdatedAt(new Date());
		this.gateNumber = gateNumber;
		this.gateType = gateType;
		this.currentOperator = currentOperator;
		this.gateStatus = gateStatus;
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
}
