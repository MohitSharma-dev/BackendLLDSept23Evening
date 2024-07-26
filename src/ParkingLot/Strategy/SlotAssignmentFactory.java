package ParkingLot.Strategy;

import ParkingLot.models.SlotAssignmentStrategyType;

public class SlotAssignmentFactory {
    public  static SlotAssignmentStrategy getSlotAssignmentStrategy(SlotAssignmentStrategyType slotAssignmentStrategyType){
        if(slotAssignmentStrategyType.equals(SlotAssignmentStrategyType.RANDOM)){
            return new RandomSlotAssignmentStrategy();
        }
        return  null;
    }
}
