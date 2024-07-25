package ParkingLot.repositories;

import ParkingLot.models.Bill;
import ParkingLot.models.Ticket;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class BillRepository {
    private static Map<Integer, Bill> bills = new TreeMap<>();
    private static int id =1;
    public BillRepository() {
//        bills.put(id, new Bill(id++));
    }

    public void saveBill(Bill bill){
        bills.put(id++, bill);
    }

    public Optional<Bill> getBill(int id){
        return Optional.ofNullable(bills.get(id));
    }
}
