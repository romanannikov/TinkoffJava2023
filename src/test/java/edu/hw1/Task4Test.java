package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task4Test {

    @Test
    @DisplayName("14365")
    void Test1() {
        String wrongstr = "214365";

        String ansstr = Task4.fixString(wrongstr);

        assertThat(ansstr)
            .isEqualTo("123456");
    }
    @Test
    @DisplayName("hTsii  s aimex dpus rtni.g")
    void Test2() {
        String wrongstr = "hTsii  s aimex dpus rtni.g";

        String ansstr = Task4.fixString(wrongstr);

        assertThat(ansstr)
            .isEqualTo("This is a mixed up string.");
    }
    @Test
    @DisplayName("badce")
    void Test3() {
        String wrongstr = "badce";

        String ansstr = Task4.fixString(wrongstr);

        assertThat(ansstr)
            .isEqualTo("abcde");
    }
    @Test
    @DisplayName("a")
    void Test4() {
        String wrongstr = "a";

        String ansstr = Task4.fixString(wrongstr);

        assertThat(ansstr)
            .isEqualTo("a");
    }
    @Test
    @DisplayName("empty")
    void Test5() {
        String wrongstr = "";

        String ansstr = Task4.fixString(wrongstr);

        assertThat(ansstr)
            .isEqualTo("");
    }
}
