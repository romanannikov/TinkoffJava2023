package edu.hw1;

import org.jetbrains.annotations.NotNull;

public class Task1 {
    private static final int SECS_IN_MIN = 60;

    private Task1() {
    }

    public static int minsToSecs(@NotNull String timeinmins) {
        if (timeinmins.matches("[0-9]+:[0-5][0-9]")) {
            String[] timeArray = timeinmins.split(":");
            try {
                return Integer.parseInt(timeArray[0]) * SECS_IN_MIN + Integer.parseInt(timeArray[1]);
            } catch (NumberFormatException e) {
                return -1;
            }
        }
        return -1;
    }
}
