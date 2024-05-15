package InheritanceConstructors;

public class C extends B{
    C(){
        System.out.println("C constructor is called");
    }

    C(String name){
        // this has to be in very first line
        this();
        System.out.println("Parameterised of C is called");
    }

}
// super();