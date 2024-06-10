package SOLID;

public class Pegion extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Pegion is flying low");
    }
}
