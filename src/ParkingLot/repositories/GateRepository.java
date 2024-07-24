package ParkingLot.repositories;

import ParkingLot.models.Gate;
import ParkingLot.models.GateType;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    private Map<Integer,Gate> gates = new TreeMap<>();

    public GateRepository()
    {
        Gate entry = new Gate();
        entry.setId(1);
        entry.setGateType(GateType.ENTRY);
        gates.put(entry.getId(),entry);

        Gate exit = new Gate();
        exit.setId(2);
        exit.setGateType(GateType.EXIT);
        gates.put(exit.getId(),exit);

    }



    public Optional<Gate> findGateById(int id)
    {
        if(gates.containsKey(id))
        {
            return Optional.of(gates.get(id));
        }
        return Optional.empty();
    }
}
// ORM
// 'select * from gate where id = 5';
// some data => Gate Object