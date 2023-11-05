package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {
    @Test
    @DisplayName("Sort by height")
    void test() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Dog1", Animal.Type.DOG, Animal.Sex.M, 10, 60, 30,true));
        animals.add(new Animal("Dog2", Animal.Type.DOG, Animal.Sex.M, 10, 65, 30,true));

        List<Animal> result = Task1.heightSort(animals);

        assertEquals(result.get(0).name(), "Dog1");
    }
}
