package AdderSubtractorLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value v;
    private Lock lock;
    private Lock lock1;

    Subtractor(Value x, Lock lock, Lock lock1){
        v = x;
        this.lock = lock;
        this.lock1 = lock1;
    }

    public Void call (){
//        lock.lock();
        for(int i = 1;i <=50000; i++){
            lock.lock();
            lock1.lock();
            System.out.println("Subtracting " + i);
            this.v.value -= i;
            lock1.unlock();
            lock.unlock();
        }
//        lock.unlock();
        return null;
    }
}
