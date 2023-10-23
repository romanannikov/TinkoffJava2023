package edu.hw2;

import edu.hw2.Task2.Rectangle;
import edu.hw2.Task2.Square;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {
    static Arguments[] rectangles() {
        return new Arguments[]{
            Arguments.of(new Rectangle()),
            Arguments.of(new Square())
        };
    }

    @ParameterizedTest
    @MethodSource("rectangles")
    void rectangleArea(Rectangle rect) {
        rect.setWidth(20);
        rect.setHeight(10);

        assertThat(rect.area()).isEqualTo(200.0);
    }

    @Test
    @DisplayName("Rectangle")
    void rectangleTest() {

        Rectangle rect = new Rectangle();

        rect.setHeight(20);
        rect.setWidth(10);
        double ans = rect.area();

        assertEquals(ans, 200);
    }

    @Test
    @DisplayName("Square")
    void squareTest() {

        Square square = new Square();

        square.setWidth(20);
        double ans = square.area();

        assertEquals(ans, 400);
    }

    @Test
    @DisplayName("Square to Rectangle")
    void squareRectTest() {

        Square square = new Square();

        square.setWidth(20);
        square.setHeight(10);
        double ans = square.area();

        assertEquals(ans, 200);
    }
}
