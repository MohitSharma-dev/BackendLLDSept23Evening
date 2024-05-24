package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

public class Client {
    public static void main(String[] args) {
        Pair<Integer , String> s = new Pair<>(5 , "Mohit");
        Integer s1 = s.getFirst();
        s.setFirst(10);
//        Pair p = new Pair(6 , "");

        List<Integer> x = new ArrayList<>();

        Pair<String , Integer> s2 = new Pair<>( "Mohit" , 5);
        Pair<Student, Integer> s3;
        // RAW TYPE
        // Object
        // Backward compatibility
        HashMap h = new HashMap();
        h.put("Mohit" , 7);
        h.put(7 , "Mohit");

        Integer st =  Pair.<Integer , String>doSomething(5);

        List<Animal> a = new ArrayList<>();
        a.add(new Animal("Poo"));
        a.add(new Animal("Jaggy"));

        AnimalUtility.printAnimalNames(a);

        List<Dog> a1 = new ArrayList<>();
        a1.add(new Dog("Tobby"));
        a1.add(new Dog("Oreo"));

        AnimalUtility.printAnimalNames(a1);



    }
}
