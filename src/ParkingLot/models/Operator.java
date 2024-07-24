package ParkingLot.models;

public class Operator extends BaseModel{
    private String Name;
    private String email;

    public Operator(String name, String email) {
        Name = name;
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
