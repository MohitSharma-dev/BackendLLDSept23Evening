package ParkingLot.repositories;

import ParkingLot.models.ParkingFloor;
import ParkingLot.models.ParkingSlot;
import ParkingLot.models.ParkingSlotStatus;
import ParkingLot.models.VehicleType;

import java.util.*;

public class ParkingSlotRepository {

    public Map<Integer, ParkingSlot> parkingSlots = new TreeMap<>();

    public ParkingSlotRepository()
    {
        ParkingSlot parkingSlot = new ParkingSlot();
        parkingSlot.setSlotNumber("F1_001_CAR");
        parkingSlot.setVehicleType(VehicleType.CAR);
        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.EMPTY);
        parkingSlot.setId(1);

        parkingSlots.put(parkingSlot.getId(),parkingSlot);

        ParkingSlot parkingSlot2 = new ParkingSlot();
        parkingSlot2.setSlotNumber("F1_002_BIKE");
        parkingSlot2.setVehicleType(VehicleType.BIKE);
        parkingSlot2.setParkingSlotStatus(ParkingSlotStatus.EMPTY);
        parkingSlot2.setId(2);

        parkingSlots.put(parkingSlot2.getId(),parkingSlot2);

        ParkingSlot parkingSlot3 = new ParkingSlot();
        parkingSlot3.setSlotNumber("F1_003_AUTO");
        parkingSlot3.setVehicleType(VehicleType.AUTO);
        parkingSlot3.setParkingSlotStatus(ParkingSlotStatus.EMPTY);
        parkingSlot3.setId(3);

        parkingSlots.put(parkingSlot3.getId(),parkingSlot3);

        ParkingSlot parkingSlot4 = new ParkingSlot();
        parkingSlot4.setSlotNumber("F1_002_BUS");
        parkingSlot4.setVehicleType(VehicleType.BUS);
        parkingSlot4.setParkingSlotStatus(ParkingSlotStatus.EMPTY);
        parkingSlot4.setId(4);

        parkingSlots.put(parkingSlot4.getId(),parkingSlot4);
    }

    public Optional<List<ParkingSlot>> getAvailableSlots()
    {
        return Optional.of(new ArrayList<>(parkingSlots.values()));
    }


}
