package ExceptionHandling;

public class StudentNotFoundException extends Exception {
    StudentNotFoundException(){
        super("Student not found");
    }

    StudentNotFoundException(String message){
        super(message);
    }
}
