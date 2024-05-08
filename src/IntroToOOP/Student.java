package IntroToOOP;

public class Student {
    private String name;
    String batch;
    protected int age;
    public int rollNo;
    Exam exam;
    static int noOfStudents = Student.initialiseVar();
    // Constructor name is same as class name
    // you don't need to mention any return type

    // you can have multiple static blocks
    // you can write static blocks anywhere in the file
    // But it will follow the order of execution
    static {
        noOfStudents = 5;
        noOfStudents++;
        try{
            noOfStudents++;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int initialiseVar(){
        noOfStudents = 5;
    }

    public Student(){
        this.name = "new_student";
        this.rollNo = 1;
        this.age = 20;
        this.batch = "new_batch";
        this.exam = new Exam(1 , 0);
        noOfStudents++;
    }

    public Student(String name, String batch, int age, int rollNo){
        this.name = name;
        this.batch = batch;
        this.age = age;
        this.rollNo = rollNo;
        noOfStudents++;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.rollNo = 1;
        this.batch = "new_batch";
        this.exam = new Exam(1 , 0);
        noOfStudents++;
    }

    Student(Student student){
        this.name = student.name;
        this.batch = student.batch;
        this.age = student.age;
        this.rollNo = student.rollNo;
        // this is the issue : this is copying the ref
        this.exam = student.exam;
        noOfStudents++;
        // correct
        this.exam = new Exam(student.exam);
    }

    public void print(){
        System.out.println("Name: " + name);
    }

    void attendClass(){
        // Inside an instance function : Can you access static variable ?
        System.out.println(Student.noOfStudents);
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

    public static int getNoOfStudents(Student st){
        // Inside a static function you can't directly access the instance variable
        System.out.println(st.name);
        return noOfStudents;
    }

    static {
        noOfStudents = 5;
    }
}


// Non - static functions can access static members (variable , method)
// static functions can't directly access non-static members