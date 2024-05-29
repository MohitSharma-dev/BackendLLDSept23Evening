package Collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        // Collection Interface

//        List : Ordered collection : Insertion order , duplicate elements are allowed

        // ArrayList : array implementation of List interface , dynamic/ resizable
        //  not synchronized
        List<Integer> list = new ArrayList<>();
        // LinkedList : Linked list is used to implement the list interface
        // Direct access is not available in O(1) time
        // Insertion and deletion
        // Doubly LL
        List<Integer> list1 = new LinkedList<>();
        // Vector : ArrayList + synchronized
        List<Integer> list2 = new Vector<>();
        // Stack : LIFO behaviour + Extends vector : synchronized
        List<Integer> list3 = new Stack<>();


        // Set : DS which doesn't store duplicate elements and it is fast in searching
        // unordered collection

        // Not ordered in any manner : random
        Set<Integer> set = new HashSet<>();
        // ordered in natural sorted manner
        // BBST : Balanced Binary Search trees : Red black tree , logarthmic TC (AVL trees)
        Set<Integer> set1 = new TreeSet<>();
        // ordered in insertion manner
        // LRU cache : DLL (helps to maintain the insertion order) + Hashmap
        Set<Integer> set2 = new LinkedHashSet<>();

        set.add(5);
        set.add(16);
        set.add(3);
        set.add(8);
        set.add(2);

        set1.add(5);
        set1.add(1);
        set1.add(3);
        set1.add(8);
        set1.add(2);

        set2.add(5);
        set2.add(1);
        set2.add(3);
        set2.add(8);
        set2.add(2);

        System.out.println(set);
        System.out.println(set1);
        System.out.println(set2);

        // Queue :
        // LinkedList class implements both the interface : List , Queue
        Queue<Integer> queue1 = new LinkedList<>();

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(8);
        queue.add(2);

        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.poll();
        }

        // Not ordered
        Map<Integer, Integer> map = new HashMap<>();
        // Insertion order
        Map<Integer, Integer> map1 = new LinkedHashMap<>();
        // order is natural ordering of the key
        Map<Integer, Integer> map2 = new TreeMap<>();


        List<Student> l1 = new ArrayList<>();
        l1.add(new Student(1 , 25, "Mohit" , "Sept23"));
        l1.add(new Student(7 , 23, "Saswat" , "Sept23"));
        l1.add(new Student(2 , 21, "Manoj" , "Sept23"));
        l1.add(new Student(5 , 19, "Radha" , "Sept23"));

        // sort function is not aware about how to sort
        Collections.sort(l1);

        for(Student student : l1){
            System.out.println(student.name);
        }

        Collections.sort(l1, new StudentRollNoComparator());

        for(Student student : l1){
            System.out.println(student.name);
        }


    }
}
// concurrent package : concurrency DS
// Lambda expression : Streams API
