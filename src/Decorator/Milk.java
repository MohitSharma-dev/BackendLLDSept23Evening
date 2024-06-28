package Decorator;

public class Milk implements AddOn{
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void getDesc() {
        beverage.getDesc();
        System.out.println("Milk : " + getCost());
    }

    @Override
    public int getCost() {
        return 10 + beverage.getCost();
    }
}
