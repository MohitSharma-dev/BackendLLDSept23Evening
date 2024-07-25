package ParkingLot.repositories;

import ParkingLot.models.Gate;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    private static final Map<Integer,Gate> gateMap = new TreeMap<>();
    private static int idCounter =1;
    public GateRepository() {
        Gate gate = new Gate();
        gate.setId(idCounter);
        gateMap.put(idCounter, gate);
        idCounter++;
    }

    public Optional<Gate> findGateById(int gateId){
        if(!gateMap.containsKey(gateId))
            return Optional.empty();
        return Optional.of(gateMap.get(gateId));
    }

    public void save(Gate gate) {
        gateMap.put(gate.getId(), gate);
    }
}
// ORM
// 'select * from gate where id = 5';
// some data => Gate Object