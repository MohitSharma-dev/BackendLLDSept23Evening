package IntroToThreads;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        // write over here the details of the task
        System.out.println("Hello World " + Thread.currentThread().getName());
    }
}
