package Decorator;

public class DarkRoast implements Beverage{
    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public void getDesc() {
        System.out.println("Dark Roast : " + getCost());
    }
}
