package ThreadPool;

public class NumberToPrint2 implements Runnable{
    int noToPrint;

    NumberToPrint2(int noToPrint){
        this.noToPrint = noToPrint;
    }

    public void run() {
        System.out.println(noToPrint + " " + Thread.currentThread().getName());
    }
}
