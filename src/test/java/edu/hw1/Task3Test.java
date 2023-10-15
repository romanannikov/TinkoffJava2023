package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task3Test {

    @Test
    @DisplayName("[1, 2, 3, 4], [0, 6]")
    void Test1() {
        int [] array1 = {1, 2, 3, 4};
        int[] array2 = {0, 6};
        boolean ans = Task3.isNestable(array1, array2);

        assertThat(ans)
            .isEqualTo(true);
    }
    @Test
    @DisplayName("[3, 1], [4, 0]")
    void Test2() {
        int [] array1 = {3, 1};
        int[] array2 = {4, 0};
        boolean ans = Task3.isNestable(array1, array2);

        assertThat(ans)
            .isEqualTo(true);
    }
    @Test
    @DisplayName("[9, 9, 8], [8, 9]")
    void Test3() {
        int [] array1 = {9, 9, 8};
        int[] array2 = {8, 9};
        boolean ans = Task3.isNestable(array1, array2);

        assertThat(ans)
            .isEqualTo(false);
    }
    @Test
    @DisplayName("[], [0, 6]")
    void Test4() {
        int [] array1 = {};
        int[] array2 = {0, 6};
        boolean ans = Task3.isNestable(array1, array2);

        assertThat(ans)
            .isEqualTo(true);
    }
    @Test
    @DisplayName("[1, 2, 3, 4], []")
    void Test5() {
        int [] array1 = {1, 2, 3, 4};
        int[] array2 = {};
        boolean ans = Task3.isNestable(array1, array2);

        assertThat(ans)
            .isEqualTo(false);
    }
}
