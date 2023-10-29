package edu.hw3;

import java.util.TreeMap;

public class Task4 {

    private final static TreeMap<Integer, String> romanNum = new TreeMap<>();

    static {

        romanNum.put(1000, "M");
        romanNum.put(900, "CM");
        romanNum.put(500, "D");
        romanNum.put(400, "CD");
        romanNum.put(100, "C");
        romanNum.put(90, "XC");
        romanNum.put(50, "L");
        romanNum.put(40, "XL");
        romanNum.put(10, "X");
        romanNum.put(9, "IX");
        romanNum.put(5, "V");
        romanNum.put(4, "IV");
        romanNum.put(1, "I");

    }

    private Task4() {
    }

    public static String convertToRoman(int num) {
        int i =  romanNum.floorKey(num);
        if (num == i) {
            return romanNum.get(num);
        }
        return romanNum.get(i) + convertToRoman(num - i);
    }
}
