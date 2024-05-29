package StreamsandLambdas;

import Collections.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        // Method 1

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside the run function");
            }
        };
        // lambdas : which are used to create objects for
        // functional interfaces without creating the class

        Runnable r = () -> {
            System.out.println("Inside the run function");
        };

        Thread thread = new Thread(r);

        Thread t = new Thread(() -> {
            System.out.println("");
        });


        thread.start();

        List<Student> l1 = new ArrayList<>();
        l1.add(new Student(1 , 25, "Mohit" , "Sept23"));
        l1.add(new Student(7 , 23, "Saswat" , "Sept23"));
        l1.add(new Student(2 , 21, "Manoj" , "Sept23"));
        l1.add(new Student(5 , 19, "Radha" , "Sept23"));

        Collections.sort(l1 , (o1, o2) -> {
            if (o1.age > o2.age) {
                return 1;
            } else if (o1.age < o2.age) {
                return -1;
            }
            return 0;
        });

        List<Integer> l2 = List.of(5 , 10 ,7 ,8 , 2 , 4);

        Stream<Integer> s1 = l2.stream();

        // Intermediate vs Terminal
        // Intermediate : return a stream
        // only one terminal function can be used
        s1 = s1.limit(4).limit(2);
        Long x = s1.count();
        System.out.println(x);

        // As soon as a terminal is used on a stream , stream is closed
//        Long y = s1.count();

        Stream<Integer> s2 = l2.stream();
        // filter is intermediate
        Long y = s2.filter((elem) -> {
            return elem % 2 == 0;
        }).count();
        System.out.println(y);

        List<Integer> l3 =
                l2
                .stream()
                .filter((elem) -> {
                    return elem % 2 == 0;
                })
                        .sorted()
                .collect(Collectors.toList());

        System.out.println(l3);

        List<Integer> l4 =        l2
                .stream()
                .filter((elem) -> {
                    return elem % 2 == 0;
                })
                .map((elem) -> {
                    return elem * elem;
                })
                .sorted()
                .collect(Collectors.toList());

        System.out.println(l4);


        Optional<Integer> o1 = l2.stream()
                .filter((elem) -> {
                    System.out.println("Filtering " + elem);
                    return elem % 2 == 0;
                })
                .map((elem) -> {
                    System.out.println("Mapping " + elem);
                    return elem * elem;
                })
//                .sorted()
                .findFirst();
        o1.ifPresent(System.out::println);

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<List<Integer>> flattenedList = listOfLists.stream()
                .map((list) -> {
                    return list.stream().map((elem) -> elem * elem).collect(Collectors.toList());
                })  // Flattening step
                .toList();

        System.out.println(flattenedList);
//        (elem) -> System.out.println(elem);
        // findFirst , findAny
    }
}
