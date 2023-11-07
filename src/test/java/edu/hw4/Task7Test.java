package edu.hw4;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task7Test {

    @Test
    void test() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Dog11", Animal.Type.DOG, Animal.Sex.M, 10, 60, 31, true));
        animals.add(new Animal("Dog2", Animal.Type.DOG, Animal.Sex.F, 11, 65, 30, true));
        animals.add(new Animal("Dog3", Animal.Type.DOG, Animal.Sex.M, 12, 68, 35, true));
        animals.add(new Animal("Cat1", Animal.Type.CAT, Animal.Sex.M, 9, 40, 25, true));
        animals.add(new Animal("Cat2", Animal.Type.CAT, Animal.Sex.M, 8, 40, 27, true));

        var test7Res1 = Task7.kAge(animals, 1);
        var test7Res2 = Task7.kAge(animals, 2);
        assertEquals(test7Res1.name(), "Dog3");
        assertEquals(test7Res2.name(), "Dog2");
    }
}
