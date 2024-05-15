package IntroToThreads;

public class HelloWorldPrinter2 extends Thread {
    @Override
    public void run() {
        System.out.println("Hello World via thread extension");
    }
}

// Thread class : run

// Now you can't extend any more class
// Composition vs Inheritance
// In this you always have to write a new thread but the runnable way can use lambda expressions
// Effectively thread also implements Runnable , so we are not actually overriding the method of Thread class