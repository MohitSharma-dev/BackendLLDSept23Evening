package AdderSubtractorSyncMethod;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value v;

    Subtractor(Value x){
        v = x;
    }

    public Void call (){
        for(int i = 1;i <=500000; i++){
//            this.v.decrementBy(i);
//            System.out.println(Value.getX());
            Value.decrement(i);
        }
        return null;
    }
}
