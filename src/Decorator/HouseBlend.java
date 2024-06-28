package Decorator;

public class HouseBlend implements Beverage{
    @Override
    public void getDesc() {
        System.out.println("House Blend : " + getCost());
    }

    @Override
    public int getCost() {
        return 75;
    }
}
