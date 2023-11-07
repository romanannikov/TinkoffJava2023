package edu.hw4;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task9Test {

    @Test
    void test() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Dog11", Animal.Type.DOG, Animal.Sex.M, 10, 60, 31, true));
        animals.add(new Animal("Dog2", Animal.Type.DOG, Animal.Sex.F, 11, 65, 30, true));
        animals.add(new Animal("Dog3", Animal.Type.DOG, Animal.Sex.M, 12, 68, 35, true));
        animals.add(new Animal("Cat1", Animal.Type.CAT, Animal.Sex.M, 9, 40, 25, true));
        animals.add(new Animal("Cat2", Animal.Type.CAT, Animal.Sex.M, 8, 40, 27, true));
        animals.add(new Animal("Fish1", Animal.Type.FISH, Animal.Sex.F, 2, 15, 2, true));
        animals.add(new Animal("Spider1", Animal.Type.SPIDER, Animal.Sex.M, 1, 5, 1, true));

        Integer test9Res = Task9.countPaws(animals);
        assertEquals(test9Res, 28);
    }
}
