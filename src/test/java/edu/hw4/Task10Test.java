package edu.hw4;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task10Test {

    @Test void test() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Dog11", Animal.Type.DOG, Animal.Sex.M, 10, 60, 31, true));
        animals.add(new Animal("Dog2", Animal.Type.DOG, Animal.Sex.F, 11, 65, 30, true));
        Animal dog3 = new Animal("Dog3", Animal.Type.DOG, Animal.Sex.M, 4, 68, 35, true);
        animals.add(dog3);
        animals.add(new Animal("Cat1", Animal.Type.CAT, Animal.Sex.M, 6, 40, 25, true));
        Animal cat2 = new Animal("Cat2", Animal.Type.CAT, Animal.Sex.M, 4, 40, 27, true);
        animals.add(cat2);
        animals.add(new Animal("Fish1", Animal.Type.FISH, Animal.Sex.F, 2, 15, 2, true));
        Animal spider1 = new Animal("Spider1", Animal.Type.SPIDER, Animal.Sex.M, 1, 5, 1, true);
        animals.add(spider1);

        List<Animal> test10Res = Task10.ageNotEqualsPaws(animals);
        assertFalse(test10Res.contains(dog3));
        assertFalse(test10Res.contains(cat2));
        assertTrue(test10Res.contains(spider1));
    }
}
