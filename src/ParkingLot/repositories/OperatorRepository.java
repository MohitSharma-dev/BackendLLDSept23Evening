package ParkingLot.repositories;

import ParkingLot.models.Operator;
import ParkingLot.models.ParkingLot;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class OperatorRepository {

    public Map<Integer, Operator> operators = new TreeMap<>();

    public OperatorRepository() {
        Operator operator = new Operator("entrywaala","entrywaala@scaler.com");
        operator.setId(1);
        operators.put(operator.getId(), operator);

        Operator operator2 = new Operator("exitwaala","exitwaala@scaler.com");
        operator2.setId(2);
        operators.put(operator2.getId(), operator2);
    }

    public Optional<Operator> getOperatorById(int operatorId)
    {
        if(operators.containsKey(operatorId)){
            return Optional.of(operators.get(operatorId));
        }
        return Optional.empty();
    }

}
