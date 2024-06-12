package Builder;

public class Student {
    String name;
    int age;
    int gradYear;
    String batch;

    public Student(String name, int age, int gradYear, String batch) {}

    public Student(Builder builder){

        if(builder.age < 25){
            throw new RuntimeException();
        }
        if(builder.gradYear > 2024){
            throw new RuntimeException();
        }

        this.name = builder.name;
        this.age = builder.age;
        this.gradYear = builder.gradYear;
        this.batch = builder.batch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
}
