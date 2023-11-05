package edu.hw1;

public class Task2 {
    private static final int RADIX = 10;

    private Task2() {
    }

    public static int countdigits(int number) {
        int num = number;
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num != 0) {
            num /= RADIX;
            count += 1;
        }
        return count;
    }
}
