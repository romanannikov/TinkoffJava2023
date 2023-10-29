package edu.hw3;

import java.util.ArrayList;
import java.util.HashMap;

public class Task3 {

    private Task3() {
    }

    public static String freqDict(ArrayList<Object> wordsArray) {
        HashMap<Object, Integer> dict = new HashMap<>();
        for (Object tempObj : wordsArray) {
            if (dict.containsKey(tempObj)) {
                dict.put(tempObj, dict.get(tempObj) + 1);
            } else {
                dict.put(tempObj, 1);
            }
        }
        return dict.toString().replace("=", ": ");
    }
}
