package edu.hw3;

import java.util.TreeMap;

public class Task4 {

    private final static TreeMap<Integer, String> ROMAN_NUM = new TreeMap<>();

    static {

        ROMAN_NUM.put(1000, "M");
        ROMAN_NUM.put(900, "CM");
        ROMAN_NUM.put(500, "D");
        ROMAN_NUM.put(400, "CD");
        ROMAN_NUM.put(100, "C");
        ROMAN_NUM.put(90, "XC");
        ROMAN_NUM.put(50, "L");
        ROMAN_NUM.put(40, "XL");
        ROMAN_NUM.put(10, "X");
        ROMAN_NUM.put(9, "IX");
        ROMAN_NUM.put(5, "V");
        ROMAN_NUM.put(4, "IV");
        ROMAN_NUM.put(1, "I");

    }

    private Task4() {
    }

    public static String convertToRoman(int num) {
        int i =  ROMAN_NUM.floorKey(num);
        if (num == i) {
            return ROMAN_NUM.get(num);
        }
        return ROMAN_NUM.get(i) + convertToRoman(num - i);
    }
}
