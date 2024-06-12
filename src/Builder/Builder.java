package Builder;

public class Builder {
    String name;
    int age;
    int gradYear;
    String batch;

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;

    }

    public Builder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;

    }

    public Builder setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    // This will help you to construct the Student object
    Student build(){
        return new Student(this);
    }
}
