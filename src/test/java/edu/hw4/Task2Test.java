package edu.hw4;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {

    @Test
    void test() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Dog11", Animal.Type.DOG, Animal.Sex.M, 10, 60, 31, true));
        animals.add(new Animal("Dog2", Animal.Type.DOG, Animal.Sex.M, 10, 65, 30, true));
        animals.add(new Animal("Dog3", Animal.Type.DOG, Animal.Sex.M, 10, 68, 35, true));

        List<Animal> test2 = Task2.weightSort(animals, 2);
        List<String> test2Res = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            test2Res.add(test2.get(i).name());
        }
        assertEquals(test2Res, List.of("Dog3", "Dog11"));
    }
}
