package Decorator;

public class Client {
    public static void main(String[] args) {
        Beverage b = new DarkRoast();
        b.getDesc();

        b = new Milk(b);
        b = new Mocha(b);
        b = new Mocha(b);
        b = new Mocha(b);
        b = new Milk(b);

        b.getDesc();
    }
}
