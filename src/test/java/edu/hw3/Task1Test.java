package edu.hw3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {

    @ParameterizedTest(name = "{index}: {0} -> {1}")
    @CsvSource({"a, z", "A, Z", "Hello world!, Svool dliow!"})
    void test(String word, String expEncodedWord) {

        String encodedWord = Task1.atbash(word);

        assertEquals(encodedWord, expEncodedWord);
    }
}
