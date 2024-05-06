package IntroToOOP;

public class Student {
    private String name;
    String batch;
    protected int age;
    public int rollNo;

    // Constructor name is same as class name
    // you don't need to mention any return type

//    public Student(){
//        this.name = "new_student";
//        this.rollNo = 1;
//        this.age = 20;
//        this.batch = "new_batch";
//    }

    public Student(String name, String batch, int age, int rollNo){
        this.name = name;
        this.batch = batch;
        this.age = age;
        this.rollNo = rollNo;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.rollNo = 1;
        this.batch = "new_batch";
    }

    public void print(){
        System.out.println("Name: " + name);
    }

    void attendClass(){
        System.out.println("Attending the Class");
    }

    public void setName(String name){
        if(name.length()<3){
            return;
        }
        this.name = name;
    }

    public String getName(){
//        if(current_user == "admin")
        return name;
    }
}
