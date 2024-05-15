package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // Interfaces can act as custom types now

        // Interface ref variable can refer to those classes which implements it

//        Runner r = new Dog();
//        r.run();
        Runner r1 = new Human();
        r1.run();

        List<Runner> participants;
        participants = new ArrayList<Runner>();
        participants.add(new Human());
//        participants.add(new Dog());

        for(Runner r2 : participants) {
            r2.run();
        }
//        Animal a = new Dog();
    }
}
