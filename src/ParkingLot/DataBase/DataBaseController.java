package ParkingLot.DataBase;

import ParkingLot.Repositories.*;
import ParkingLot.models.*;

import java.util.Arrays;


public class DataBaseController {
    public static void InitializeDataBaseTransaction(GateRepository gateRepository, ParkingLotRepository parkingLotRepository,
                                                     OperatorRepository operatorRepository,
                                                     ParkingFloorRepository parkingFloorRepository,
                                                     ParkingSlotRepository parkingSlotRepository) {
        //Operator
        Operator operator1 = new Operator();
        operator1.setName("Rachana");
        operator1.setPhoneNumber(12334);
        operatorRepository.save(operator1);


        Operator operator2= new Operator();
        operator2.setName("Rambo");
        operator2.setPhoneNumber(56789);
        operatorRepository.save(operator2);

        //Gate
        Gate gate1 = new Gate();
        gate1.setGateNumber("1A");
        gate1.setGateType(GateType.ENTRY_GATE);
        gate1.setOperator(operator1);
        gate1.setGateStatus(GateStatus.OPEN);
        gateRepository.saveGate(gate1);

        Gate gate2 = new Gate();
        gate2.setGateNumber("1B");
        gate2.setGateType(GateType.EXIT_GATE);
        gate2.setOperator(operator2);
        gate2.setGateStatus(GateStatus.OPEN);
        gateRepository.saveGate(gate2);



        //ParkingFloor
        ParkingFloor parkingFloor = new ParkingFloor();
        parkingFloor.setParkingFloorName("GroundFloor");
        parkingFloor.setAllowedVehicleTypes(Arrays.asList(AllowedVehicleType.CAR,AllowedVehicleType.CAR));
        parkingFloor.setParkingFloorStatus(ParkingFloorStatus.OPEN);
        parkingFloor = parkingFloorRepository.Save(parkingFloor);

        VehicleTypeCapacity vehicleTypeCapacity1 = new VehicleTypeCapacity();
        vehicleTypeCapacity1.setVehicleType(AllowedVehicleType.CAR);
        vehicleTypeCapacity1.setCapacity(0);

        VehicleTypeCapacity vehicleTypeCapacity2 = new VehicleTypeCapacity();
        vehicleTypeCapacity2.setVehicleType(AllowedVehicleType.AUTO);
        vehicleTypeCapacity2.setCapacity(0);

        parkingFloor.setVehicleTypeCapacity(Arrays.asList(vehicleTypeCapacity1, vehicleTypeCapacity2));

//        ParkingFloorVehicleTypeCapacityRepository.
//                LoadData(parkingFloor.getParkingFloorName(), (ArrayList<VehicleTypeCapacity>) Arrays.asList(vehicleTypeCapacity1,vehicleTypeCapacity2));


        //ParkingSlot
        ParkingSlot parkingSlot = new ParkingSlot();
        parkingSlot.setParkingSlotId("GA");
        parkingSlot.setAllowedVehicleType(AllowedVehicleType.CAR);
        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.EMPTY);
        parkingSlot.setVehicle(null);
        parkingSlot.setParkingFloor(parkingFloor);
        parkingSlot = parkingSlotRepository.SaveParkingSlot(parkingSlot);


        //add this slot to the floor
        parkingFloor.setParkingSlots(Arrays.asList(parkingSlot));


        //ParkingLot
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setLocation("Bangalore");
        parkingLot.setAllowedVehicleTypes(Arrays.asList(AllowedVehicleType.AUTO,AllowedVehicleType.BIKE,AllowedVehicleType.CAR));
        parkingLot.setParkingFloors(Arrays.asList(parkingFloor));
        parkingLot.setEntryGateList(Arrays.asList(gate1,gate2));
        parkingLot.setExitGateList(Arrays.asList(gate2,gate1));
        parkingLot.setParkingSlotAssignmentStrategyType(SlotAssignmentStrategyType.RANDOM);
        parkingLotRepository.save(parkingLot);

    }
}
