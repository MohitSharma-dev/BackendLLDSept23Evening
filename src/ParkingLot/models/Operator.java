package ParkingLot.models;

public class Operator extends BaseModel{
    private String Name;
    private Gate gate;

    public Operator(String name) {
        super();
        this.Name = name;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
