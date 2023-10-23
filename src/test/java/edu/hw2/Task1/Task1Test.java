package edu.hw2.Task1;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;

public class Task1Test {

    private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger();

    @Test
    void calcTest() {

        var two = new Expr.Constant(2);
        var four = new Expr.Constant(4);
        var negOne = new Expr.Negate(new Expr.Constant(1));
        var sumTwoFour = new Expr.Addition(two, four);
        var mult = new Expr.Multiplication(sumTwoFour, negOne);
        var exp = new Expr.Exponent(mult, 2);
        var res = new Expr.Addition(exp, new Expr.Constant(1));

        LOGGER.info(res + " = " + res.evaluate());
    }
}
