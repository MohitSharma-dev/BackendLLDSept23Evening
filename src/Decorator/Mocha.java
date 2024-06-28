package Decorator;

public class Mocha implements AddOn{
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public int getCost() {
        return 12 + beverage.getCost();
    }

    @Override
    public void getDesc() {
        beverage.getDesc();
        System.out.println("Mocha : " + getCost());
    }
}
