package edu.hw2.Task1;

public sealed interface Expr permits Expr.Constant, Expr.Negate, Expr.Exponent, Expr.Addition, Expr.Multiplication {
    double evaluate();

    record Constant(double num) implements Expr {
        @Override
        public double evaluate() {
            return num;
        }
    }

    record Negate(Expr num) implements Expr {
        public double evaluate() {
            return num.evaluate() * (-1);
        }
    }

    record Exponent(Expr num, double exp) implements Expr {
        public double evaluate() {
            return Math.pow(num.evaluate(), exp);
        }
    }

    record Addition(Expr fNum, Expr sNum) implements Expr {
        public double evaluate() {
            return fNum.evaluate() + sNum.evaluate();
        }
    }

    record Multiplication(Expr fNum, Expr sNum) implements Expr {
        public double evaluate() {
            return fNum.evaluate() * sNum.evaluate();
        }
    }
}
