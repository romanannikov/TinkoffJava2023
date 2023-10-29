package edu.hw3;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task3Test {

    @Test
    void test1() {
        Object[] words = new Object[]{"a", "bb", "a", "bb"};
        ArrayList<Object> wordsArray = new ArrayList<>(Arrays.asList(words));

        String dict = Task3.freqDict(wordsArray);

        assertThat(dict).isEqualTo("{bb: 2, a: 2}");
    }

    @Test
    void test2() {
        Object[] words = new Object[]{"this", "and", "that", "and"};
        ArrayList<Object> wordsArray = new ArrayList<>(Arrays.asList(words));

        String dict = Task3.freqDict(wordsArray);

        assertThat(dict).isEqualTo("{that: 1, and: 2, this: 1}");
    }

    @Test
    void test3() {
        Object[] words = new Object[]{"код", "код", "код", "bug"};
        ArrayList<Object> wordsArray = new ArrayList<>(Arrays.asList(words));

        String dict = Task3.freqDict(wordsArray);

        assertThat(dict).isEqualTo("{код: 3, bug: 1}");
    }

    @Test
    void test4() {
        Object[] words = new Object[]{1, 1, 2, 2};
        ArrayList<Object> wordsArray = new ArrayList<>(Arrays.asList(words));

        String dict = Task3.freqDict(wordsArray);

        assertThat(dict).isEqualTo("{1: 2, 2: 2}");
    }
}
