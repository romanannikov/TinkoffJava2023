package edu.hw1;

public class Task2 {
    private static final int RADIX = 10;

    private Task2() {
    }

    public static int countdigits(int Num) {
        if (Num == 0) {
            return 1;
        }
        int count = 0;
        while (Num > 0) {
            Num /= RADIX;
            count += 1;
        }
        return count;
    }
}
