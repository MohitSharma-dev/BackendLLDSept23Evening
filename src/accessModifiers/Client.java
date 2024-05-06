package accessModifiers;

import IntroToOOP.Student;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
//        student.name = "Mohit";
        student.setName("Mohit");
        student.getName();
        student.rollNo = 1;
//        default can't be accessed outside the package
//        student.batch = "Sept23";
        // protected can't be accessed outside the package without child class
//        student.age = 25;
    }
}

// private : only within class
// default :  within class + same package
// protected : within class + same package + outside_package_only_child_class
// public : everywhere