package ParkingLot.Repositories;

import ParkingLot.models.Gate;

import java.util.HashMap;
import java.util.Optional;

public class GateRepository {
    HashMap<String, Gate> gates = new HashMap<String,Gate>();
    int gateId =0;

    public Optional<Gate> getGateByGateNumber(String gateNumber){
        if(gates.containsKey(gateNumber))
            return Optional.ofNullable(gates.get(gateNumber));

        return Optional.empty();
    }

    public void saveGate(Gate gate){
        gateId+=1;
        gate.setId(gateId);
        gates.put(gate.getGateNumber(), gate);
    }
}
