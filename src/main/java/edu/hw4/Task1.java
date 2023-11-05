package edu.hw4;

import java.util.Comparator;
import java.util.List;

public class Task1 {

    private Task1() {
    }

    public static List<Animal> heightSort(List<Animal> animals) {
        return animals.stream()
            .sorted(Comparator.comparing(Animal::height))
            .toList();
    }
}
