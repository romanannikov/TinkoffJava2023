package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {

    @Test
    @DisplayName("11")
    void Test11() {
        int num = 11;

        int ans = Task2.CountDigits(num);

        assertThat(ans)
            .isEqualTo(2);
    }
    @Test
    @DisplayName("0")
    void Test0() {
        int num = 0;

        int ans = Task2.CountDigits(num);

        assertThat(ans)
            .isEqualTo(1);
    }
    @Test
    @DisplayName("100")
    void Test100() {
        int num = 100;

        int ans = Task2.CountDigits(num);

        assertThat(ans)
            .isEqualTo(3);
    }
    @Test
    @DisplayName("1234")
    void Test1234() {
        int num = 1234;

        int ans = Task2.CountDigits(num);

        assertThat(ans)
            .isEqualTo(4);
    }
    @Test
    @DisplayName("max")
    void Testmax() {
        int num = Integer.MAX_VALUE;

        int ans = Task2.CountDigits(num);

        assertThat(ans)
            .isEqualTo(10);
    }
}
