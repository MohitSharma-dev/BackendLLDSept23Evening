package AdderSubtractorLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value v;
    private Lock lock;
    private Lock lock1;

    Adder(Value x, Lock lock, Lock lock1){
        v = x;
        this.lock = lock;
        this.lock1 = lock1;
    }
    public Void call (){
//        lock.lock();
        for(int i = 1;i <=50000; i++){
            // critical section
            lock1.lock();
            lock.lock();
            System.out.println("Adding " + i);
            this.v.value += i;
            lock.unlock();
        }
        lock.unlock();
        return null;
    }
}


