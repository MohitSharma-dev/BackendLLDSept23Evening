package IntroToThreads;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter h = new HelloWorldPrinter();

        System.out.println("Thread : " + Thread.currentThread().getName());
        Thread t = new Thread(h);
        // h.run();
        t.start();

        NumberPrinter n = new NumberPrinter();
        Thread t2 = new Thread(n);
        t2.start();

        for(int i = 1; i <= 1000000; i++){
            NumberToPrint2 x1 = new NumberToPrint2(i);
            Thread t3 = new Thread(x1);
            t3.start();
        }

        Thread t5 = new HelloWorldPrinter2();
        t5.start();
    }
}

// step 1 : create a class for the task you want to do
// step 2 : implement runnable interface
// step 3 : give the definition of run function
// step 4 : create a new thread and pass the obj of your task in constructor
// step 5 : .start();

// print 1 -> 100 in a thread