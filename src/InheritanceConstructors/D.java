package InheritanceConstructors;

public class D extends C{
    D(){
        // super always needs to be the first line
        super("Mohit");
        System.out.println("D constructor is called");
    }
}

// super();
