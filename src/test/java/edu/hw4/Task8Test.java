package edu.hw4;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task8Test {

    @Test
    void test() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Dog11", Animal.Type.DOG, Animal.Sex.M, 10, 60, 31, true));
        animals.add(new Animal("Dog2", Animal.Type.DOG, Animal.Sex.F, 11, 65, 30, true));
        animals.add(new Animal("Dog3", Animal.Type.DOG, Animal.Sex.M, 12, 68, 35, true));
        animals.add(new Animal("Cat1", Animal.Type.CAT, Animal.Sex.M, 9, 40, 25, true));
        animals.add(new Animal("Cat2", Animal.Type.CAT, Animal.Sex.M, 8, 40, 27, true));

        Optional<Animal> test7Res1 = Task8.heaviestLowerThenK(animals, 64);
        var test7Res2 = Task8.heaviestLowerThenK(animals, 41);
        var test7Res3 = Task8.heaviestLowerThenK(animals, 40);
        test7Res1.ifPresent(animal -> assertEquals(animal.weight(), 31));
        test7Res2.ifPresent(animal -> assertEquals(animal.weight(), 27));
        assertTrue(test7Res3.isEmpty());
    }
}
