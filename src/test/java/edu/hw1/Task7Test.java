package edu.hw1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Task7Test {
    @ParameterizedTest(name = "{index}: {0} -{1}-> {2}")
    @CsvSource({"16, 1, 1", "17, 2, 6"})
    void testLeft(int num, int shift, int expRotatedNum) {

        int rotatedNum = Task7.rotateLeft(num, shift);

        assertEquals(rotatedNum, expRotatedNum);
    }

    @ParameterizedTest(name = "{index}: {0} -{1}-> {2}")
    @CsvSource({"16, 2, 4", "8, 1, 4"})
    void testRight(int num, int shift, int expRotatedNum) {

        int rotatedNum = Task7.rotateRight(num, shift);

        assertEquals(rotatedNum, expRotatedNum);
    }
}
