package PrototypeAndRegistry;

public class Student implements Prototype<Student>{
    int id;
    String name;
    String batch;
    String type;

    Student(){
        // db call to get the details of the student
        // fill in the data here
    }

    Student(Student other){
        this.id = other.id;
        this.name = other.name;
        this.batch = other.batch;
    }

    @Override
    public Student copy() {
        Student st = new Student(this);
        return st;
    }
}
