package edu.hw4;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5Test {

    @Test
    void test() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Dog11", Animal.Type.DOG, Animal.Sex.M, 10, 60, 31, true));
        animals.add(new Animal("Dog2", Animal.Type.DOG, Animal.Sex.F, 10, 65, 30, true));
        animals.add(new Animal("Dog3", Animal.Type.DOG, Animal.Sex.M, 10, 68, 35, true));
        animals.add(new Animal("Cat1", Animal.Type.CAT, Animal.Sex.M, 8, 40, 25, true));

        Animal.Sex test5Res = Task5.maxSex(animals);
        assertEquals(test5Res, Animal.Sex.M);
    }
}