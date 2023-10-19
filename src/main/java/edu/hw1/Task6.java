package edu.hw1;

import org.jetbrains.annotations.NotNull;
import java.util.Arrays;

public class Task6 {

    private Task6() {
    }

    private final static int CONST_KAPR = 6174;
    private final static int LEN = 4;
    private final static int RADIX = 10;

    public static int funcKapr(@NotNull Integer num) {
        int minNum = 0;
        int maxNum = 0;
        char[] tempArray = num.toString().toCharArray();
        int[] numArray = new int[LEN];
        for (int i = 0; i < LEN; i++) {
            numArray[i] = tempArray[i] - '0';
            if ((i > 0) && (numArray[i] == numArray[i - 1])) {
                return -1;
            }
        }
        Arrays.sort(numArray);
        for (int i = 0; i < LEN; i++) {
            minNum = minNum * RADIX + numArray[i];
            maxNum = maxNum * RADIX + numArray[LEN - i - 1];
        }
        Integer residual = maxNum - minNum;
        if (residual.equals(CONST_KAPR)) {
            return 1;
        }
        return 1 + funcKapr(residual);
    }
}
