package AdderSubtractor;

import java.util.concurrent.atomic.AtomicInteger;

public class Value {
//    public int value = 0;
    public AtomicInteger value = new AtomicInteger(0);
}

// += i from 3 -> 1 : CAS

 // t <- value = 0
 // t = t + i  = 1
 // t -> value = 1

// t <- value = 1
// t = t - i = 0
// t -> value = 0