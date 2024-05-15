package Inheritance;

public class Student extends User{
    private String course;
    String batch;
    int age;
    String name;
    int d = 15;

    void attendClass(){
        super.name = "dsad";
        this.batch = "something";
        System.out.println("Attend Class");
    }

    void getName(){
        System.out.println(this.name);
    }

    void login(){
    }

    static void doSomething(){
        System.out.println("Student class do something");
    }

    Student(){
        d = 20;
        System.out.println("Student Constructor");
    }
}
