package ParkingLot.strategies;

import ParkingLot.models.VehicleType;

public class AmountCalculationStrategy {
    //implemented Simple factory. can be extended to factory method.
    public int getAmount(VehicleType v,int durationInHours){
        if(durationInHours < 0) return 0;
        if(v == VehicleType.BUS) {
            return durationInHours * 80;
        };
        if(v == VehicleType.TRUCK) {
            return durationInHours * 60;
        }
        if(v == VehicleType.CAR) {
            return durationInHours * 40;
        }
        else {
            return durationInHours * 30;
        }
    }
}
