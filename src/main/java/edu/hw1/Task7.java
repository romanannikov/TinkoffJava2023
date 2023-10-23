package edu.hw1;

public class Task7 {

    private Task7() {
    }

    public static Integer rotateLeft(int num, int shift) {
        int shiftLeft = shift;
        char[] numArray = Integer.toBinaryString(num).toCharArray();
        if (shiftLeft < 0) {
            int shiftRight = Math.abs(shiftLeft);
            return rotateRight(num, shiftRight);
        }
        char tempChar;
        shiftLeft %= numArray.length;
        for (int i = 0; i < shiftLeft; i++) {
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
        int shiftRight = shift;
        if (shiftRight < 0) {
            int shiftLeft = Math.abs(shiftRight);
            return rotateLeft(num, shiftLeft);
        }
        char tempChar;
        shiftRight %= numArray.length;
        for (int i = 0; i < shiftRight; i++) {
            tempChar = numArray[numArray.length - 1];
            for (int j = numArray.length - 1; j > 0; j--) {
                numArray[j] = numArray[j - 1];
            }
            numArray[0] = tempChar;
        }
        return Integer.parseInt(String.valueOf(numArray), 2);
    }
}
