package ThreadPool;

import IntroToThreads.HelloWorldPrinter;
import IntroToThreads.HelloWorldPrinter2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        // List<Thread> t;
        for(int i = 1; i <= 1000; i++){
            if( i == 420){
                System.out.println("");
            }
            NumberToPrint2 x1 = new NumberToPrint2(i);
            es.execute(x1);
        }
    }
}

// step 1 : create a class for the task you want to do
// step 2 : implement runnable interface
// step 3 : give the definition of run function
// step 4 : create a new thread and pass the obj of your task in constructor
// step 5 : .start();

// print 1 -> 100 in a thread