package AdderSubtractorSyncMethod;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value v;

    Adder(Value x){
        v = x;
    }
    public Void call (){
        for(int i = 1;i <=500000; i++){
//           this.v.incrementBy(i);
//            System.out.println(Value.getX());
            Value.increment(i);
        }
        return null;
    }
}


