package IterableandIterators;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Numbers num = new Numbers();
        num.numbers = List.of(4 , 5 , 2 , 3 , 10 , 5 , 15 , 24 , 25 ,23);
        for(Integer w : num){
            System.out.println(w);
        }

        Student st1 = new Student("Mohit", 25);
//        Student st2 = st1;
        Student st2 = (Student) st1.clone();
        Student st3 = st1;
//        System.out.println(st2);
        System.out.println(st3.equals(st2));
        System.out.println(st3.equals(st1));


    }
}
