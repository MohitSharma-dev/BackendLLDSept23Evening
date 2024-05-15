package Inheritance;

public class User {
    int id;
    String name;
    private int rollNo;
    int d = 10;

    void login(){
        System.out.println("User has logged in");
    }

    User(){
        System.out.println("User constructor");
    }

    static void doSomething(){
        System.out.println("User class do something");
    }
}
