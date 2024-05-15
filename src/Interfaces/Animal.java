package Interfaces;

public abstract class Animal {
    int noOfLegs;
    String species;

    void walk(){
        System.out.println("Animal is walknig");
    }

    abstract void eat();
}


// abstract class doesn't mandate to have an abstract method
// abstract method can only be written in abstract class