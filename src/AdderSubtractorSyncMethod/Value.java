package AdderSubtractorSyncMethod;

public class Value {
    public int value = 0;
    static int x = 5;

    synchronized void incrementBy(int i) {
        value += i;
    }

    synchronized void decrementBy(int i) {
        value -= i;
    }

    static synchronized int getX(){
        return x;
    }

    static synchronized void increment(int i){
        x += i;
    }

    static synchronized void decrement(int i){
        x -= i;
    }


}
