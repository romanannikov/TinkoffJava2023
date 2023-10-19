package edu.hw1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {

    @ParameterizedTest(name = "{index} - {0} is {1}")
    @CsvSource({"00:00, 0", "00:01, 1", "00:10, 10", "1:00, 60", "100:59, 6059", "0:66, -1", ":066, -1"})
    void test(String timeMins, int expTimeSecs) {

        int timeSecs = Task1.minsToSecs(timeMins);

        assertEquals(timeSecs, expTimeSecs);
    }
}
