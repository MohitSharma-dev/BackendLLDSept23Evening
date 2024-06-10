package SOLID;

public class Sparrow extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Sparrow is flying low");
    }
}
