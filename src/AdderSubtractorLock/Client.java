package AdderSubtractorLock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Lock lock = new ReentrantLock();
        Lock lock1 = new ReentrantLock();
        Adder x = new Adder(v , lock , lock1);

        Subtractor y = new Subtractor(v, lock, lock1);
        ExecutorService ec = Executors.newCachedThreadPool();

        Future<Void> adderFuture= ec.submit(x);
        Future<Void> subtractorFuture= ec.submit(y);

        // Wait for both the tasks to get completed
        adderFuture.get();
        subtractorFuture.get();

        System.out.println(v.value);
    }
}
