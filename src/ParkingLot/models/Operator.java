package ParkingLot.models;

import java.util.Date;

public class Operator extends BaseModel {
	private String name;
	private Gate gate;

	public Operator() {
		// TODO Auto-generated constructor stub
	}

	public Operator(int id, String name) {
		this.setId(id);
		this.setCreatedAt(new Date());
		this.setUpdatedAt(new Date());
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gate getGate() {
		return gate;
	}

	public void setGate(Gate gate) {
		this.gate = gate;
	}
	
}
