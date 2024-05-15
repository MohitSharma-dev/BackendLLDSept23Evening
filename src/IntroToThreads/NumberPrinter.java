package IntroToThreads;

public class NumberPrinter implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
