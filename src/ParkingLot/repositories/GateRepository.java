package ParkingLot.repositories;

import ParkingLot.models.Gate;
import ParkingLot.models.GateStatus;
import ParkingLot.models.GateType;
import ParkingLot.models.Operator;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
	Map<Integer, Gate> gates = new TreeMap<>();

	public GateRepository() {
		Gate g1 = new Gate(1, "EN1", GateType.ENTRY, new Operator(1, "Rahul"), GateStatus.OPEN);
		Gate g2 = new Gate(2, "EX1", GateType.EXIT, new Operator(2, "Rohit"), GateStatus.OPEN);
		gates.put(1, g1);
		gates.put(2, g2);
	}

	public Optional<Gate> findGateById(int gateId) {
		return Optional.of(gates.get(gateId));
	}
}
// ORM
// 'select * from gate where id = 5';
// some data => Gate Object