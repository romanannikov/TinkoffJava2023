package edu.hw1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {

    @ParameterizedTest(name = "{index} - {1} digits in {0}")
    @CsvSource({"1, 1", "0, 1", "100, 3", "1234, 4", "-100, 3"})
    void test(int num, int expCountDigits) {

        int countDigits = Task2.countdigits(num);

        assertEquals(countDigits, expCountDigits);
    }
}
