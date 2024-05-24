package Generics;

import java.util.List;

public class AnimalUtility {
    public static void printAnimalNames(List< ? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.name);
        }
//        animals.add(new Dog(""));
    }

    public static <T extends Animal> T printAnimalNames(List<T> animals , T parentAnimal) {
        System.out.println(parentAnimal.name);
        return parentAnimal;
    }
}
