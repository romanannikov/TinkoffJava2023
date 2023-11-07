package edu.hw4;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task10 {

    private Task10() {
    }

    public static List<Animal> ageNotEqualsPaws(List<Animal> animals) {
        return animals.stream()
            .filter(animal -> animal.age() != animal.paws())
            .toList();
    }
}
