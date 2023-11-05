package edu.hw3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test {

    @ParameterizedTest(name = "{index}: {0} -> {1}")
    @CsvSource({"2, II", "12, XII", "16, XVI"})
    void test(int num, String expRomanNum) {

        String romanNum = Task4.convertToRoman(num);

        assertEquals(romanNum, expRomanNum);
    }
}
