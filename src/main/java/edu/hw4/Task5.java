package edu.hw4;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5 {

    private Task5() {
    }

    public static Animal.Sex maxSex(List<Animal> animals) {
        return animals.stream()
            .collect(Collectors.groupingBy(Animal::sex, Collectors.counting()))
            .entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .toList().get(0).getKey();
    }
}
