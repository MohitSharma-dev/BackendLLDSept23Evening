package IntroToOOP;

public class Client {
    public static void main(String[] args) {
        // Student() : Constructor of the class
        // If not defined by us, java provides us a default one
        Student x = new Student();
        x.age = 45;

//        Student y = x;
        Student y = new Student();

        y.age = x.age;
        y.age += 10;

        System.out.println(x.age);

        x.age = 90;
        // private can't be accessed outside the class
//        x.name = "Mohit";
        x.rollNo = 1;
        x.batch = "Sept23";
        x.setName("Mohit");

        Student z = new Student("Mohit", "Sept23", 25, 5);
        Student a = new Student("Mohit", 25);

        Student copySt = new Student(a);
        System.out.println(copySt.getName());
        System.out.println(Student.noOfStudents);
        System.out.println(Student.getNoOfStudents(copySt));


    }
}

// Constructor helps you in the process of creation of the object
// It initialises the values of the attributes
// Even though language provides the default
// You can write your own constructors
// As soon as you write your own constructor, default one doesn't exist anymore