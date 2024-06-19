package PrototypeAndRegistry;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = st1.copy();
        StudentRegistry.fillRegistry();
        Student st3 = StudentRegistry.get("Academy");
    }
}


// AcademyStudent
// SSTStudent
// SSBStudent
// DSMLStudent