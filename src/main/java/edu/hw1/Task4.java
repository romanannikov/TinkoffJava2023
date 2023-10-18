package edu.hw1;

import org.jetbrains.annotations.NotNull;

public class Task4 {

    private Task4() {
    }

    public static String fixString(@NotNull String wrongstr) {
        char[] ansstr = wrongstr.toCharArray();
        for (int i = 0; i < wrongstr.length() - 1; i += 2) {
            char temp = ansstr[i];
            ansstr[i] = ansstr[i + 1];
            ansstr[i + 1] = temp;
        }
        return new String(ansstr);
    }
}
