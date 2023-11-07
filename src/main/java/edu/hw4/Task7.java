package edu.hw4;

import java.util.Comparator;
import java.util.List;

public class Task7 {

    private Task7() {
    }

    public static Animal kAge(List<Animal> animals, int k) {
        return animals.stream()
            .sorted(Comparator.comparingInt(Animal::age).reversed())
            .toList()
            .get(k - 1);
    }
}
