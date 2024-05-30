package ExceptionHandling;

import IterableandIterators.Numbers;

import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.logging.Logger;

public class Client {

    public static void check(int a){
        check(a * a);
    }

    public static void main(String[] args) throws FileNotFoundException , StudentNotFoundException{

//        int z1 = Student.doSomething(11);

        try {
            int y = Student.doSomething(2);
            // if the try block throws some exception  , it will go to the catch
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (StudentNotFoundException e) {
            System.out.println("Student not found");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        }

//        check(5);

        try{
            int z = Student.doSomething(11);

//            D d = new A();

            if(z % 2 == 0)
            throw new D();
            else if (z % 3 == 0)
                throw new C();
            else if (z % 5 == 0)
                throw new B();
//            else
//                throw new A();
        } catch (A e){
            System.out.println("A is thrown");
        } catch (B e) {
            System.out.println("B is thrown");
        } catch (C e){
            System.out.println("C is thrown");
        } catch (D e){
            System.out.println("D is thrown");
        } finally {
            // exectues once the try - catch block is done
            System.out.println("I am finally block");
        }

        List<Integer> x7 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        for(Integer x : x7){
            System.out.println(x);
        }

//        Iterator it = x7.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }


        //
//        Queue
//        OutOfMemoryError
//        Logger
//        Collection

    }
}

// A B C D
// A -> B -> C -> D

// checked : handle , keep on throwing it further

// Queue

// add ==== offer
// remove ==== poll
// element ==== peek

// order of catch matters : it should from child to parent

