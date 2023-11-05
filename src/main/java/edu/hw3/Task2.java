package edu.hw3;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    private Task2() {
    }

    private static final String[] ERROR = {"ERROR"};

    public static String[] clusterize(String brackets) {
        int counter = 0;
        StringBuilder bracketsStr = new StringBuilder();
        List<String> bracketsList = new ArrayList<>();
        char[] bracketsArray = brackets.toCharArray();
        for (Character bracket : bracketsArray) {
            if (bracket.equals('(')) {
                counter++;
            } else if (bracket.equals(')')) {
                counter--;
            }
            bracketsStr.append(bracket);
            if (counter == 0) {
                bracketsList.add(bracketsStr.toString());
                bracketsStr = new StringBuilder();
            }
            if (counter < 0) {
                return ERROR;
            }
        }
        return bracketsList.toArray(new String[0]);
    }
}
