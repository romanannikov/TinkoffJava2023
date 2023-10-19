package edu.hw1;

public class Task7 {

    private Task7() {
    }

    public static Integer rotateLeft(int num, int shift) {
        char[] numArray = Integer.toBinaryString(num).toCharArray();
        if (shift < 0) {
            shift = Math.abs(shift);
            return rotateRight(num, shift);
        }
        char tempChar;
        shift = shift % numArray.length;
        for (int i = 0; i < shift; i++) {
            tempChar = numArray[0];
            for (int j = 0; j < numArray.length - 1; j++) {
                numArray[j] = numArray[j + 1];
            }
            numArray[numArray.length - 1] = tempChar;
        }
        return Integer.parseInt(String.valueOf(numArray), 2);
    }

    public static Integer rotateRight(int num, int shift) {
        char[] numArray = Integer.toBinaryString(num).toCharArray();
        if (shift < 0) {
            shift = Math.abs(shift);
            return rotateLeft(num, shift);
        }
        char tempChar;
        shift = shift % numArray.length;
        for (int i = 0; i < shift; i++) {
            tempChar = numArray[numArray.length - 1];
            for (int j = numArray.length - 1; j > 0; j--) {
                numArray[j] = numArray[j - 1];
            }
            numArray[0] = tempChar;
        }
        return Integer.parseInt(String.valueOf(numArray), 2);
    }
}
