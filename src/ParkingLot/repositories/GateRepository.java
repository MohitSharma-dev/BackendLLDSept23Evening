package ParkingLot.repositories;

import ParkingLot.models.Gate;

import java.util.Optional;

public class GateRepository {
    public Optional<Gate> findGateById(int gateId){
        return Optional.empty();
    }
}
// ORM
// 'select * from gate where id = 5';
// some data => Gate Object