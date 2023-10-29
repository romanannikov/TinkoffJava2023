package edu.hw1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Task6Test {
    @ParameterizedTest(name = "{index}: {1} steps for {0}")
    @CsvSource({"3524, 3", "6174, 1", "1234, 3", "1111, -1"})
    void test(Integer num, Integer expToKapr) {

        Integer toKapr = Task6.funcKapr(num);

        assertEquals(toKapr, expToKapr);
    }
}
