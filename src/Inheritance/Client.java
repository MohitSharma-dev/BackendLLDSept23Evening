package Inheritance;

public class Client {
    public static void main(String[] args) {
//        User u = new User();

        Student s = new Student();
        s.doSomething();

        Student st = new Student();
        st.attendClass();
        System.out.println("Debug");

        User u1 = new User();
        u1.doSomething();

        User u = new Student();
        u.login();
        u.doSomething();
        System.out.println(u.d);

    }
}

// child and parent constructor both runs
// first parent runs and then child

// Student constructor will be called
// this will call the user constructor