package edu.hw1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5Test {

    @ParameterizedTest(name = "{index}: {0} - {1}")
    @CsvSource({"112, false", "0, false", "11211230, true", "13001120, true", "23336014, true"})
    void test(int num, boolean expIsPali) {

        boolean isPal = Task5.isPalindromeDescendant(num);

        assertEquals(isPal, expIsPali);
    }
}
