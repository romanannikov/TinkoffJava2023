package edu.hw3;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {
    @Test
    void test1() {
        // given
        String brackets = "()()()";

        // when
        String[] clustBrackets = Task2.clusterize(brackets);

        // then
        assertThat(clustBrackets).isEqualTo(new String[]{"()", "()", "()"});
    }

    @Test
    void test2() {
        // given
        String brackets = "((()))";

        // when
        String[] clustBrackets = Task2.clusterize(brackets);

        // then
        assertThat(clustBrackets).isEqualTo(new String[]{"((()))"});
    }

    @Test
    void test3() {
        // given
        String brackets = "((()))(())()()(()())";

        // when
        String[] clustBrackets = Task2.clusterize(brackets);

        // then
        assertThat(clustBrackets).isEqualTo(new String[]{"((()))", "(())", "()", "()", "(()())"});
    }

    @Test
    void test4() {
        // given
        String brackets = "((())())(()(()()))";

        // when
        String[] clustBrackets = Task2.clusterize(brackets);

        // then
        assertThat(clustBrackets).isEqualTo(new String[]{"((())())", "(()(()()))"});
    }
}
