package ParkingLot.Repositories;

import ParkingLot.models.Operator;

import java.util.HashMap;

public class OperatorRepository {
    HashMap<String, Operator> operators = new HashMap<String, Operator>();
    int operatorId = 0;


    public void save(Operator operator) {
        operatorId+=1;
        operator.setId(operatorId);
        operators.put(operator.getName(), operator);
    }

    public Operator getOperatorByName(String name) {
        if(operators.containsKey(name)) {
            return operators.get(name);
        }
        return null;
    }
}
