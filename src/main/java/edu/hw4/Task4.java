package edu.hw4;

import java.util.Comparator;
import java.util.List;

public class Task4 {

    private Task4() {
    }

    public static Animal nameLenght(List<Animal> animals) {
        return animals.stream()
            .max(Comparator.comparingInt(a -> a.name().length()))
            .orElse(null);
    }
}
