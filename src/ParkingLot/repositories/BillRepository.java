package ParkingLot.repositories;

import java.util.Map;
import java.util.TreeMap;

import ParkingLot.models.Bill;

public class BillRepository {

	private Map<Integer, Bill> bills = new TreeMap<>();
	private int previousId = 0;

	public Bill save(Bill bill) {
		previousId += 1;
		bill.setId(previousId);
		bills.put(bill.getId(), bill);
		return bill;
	}

}
