package edu.hw1;

public class Task5 {

    private Task5() {
    }

    private static boolean isPalindrome(char[] strArray) {
        for (int i = 0; i < (strArray.length - 1) / 2; i++) {
            if (!(strArray[i] == strArray[strArray.length - 1 - i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeDescendant(int number) {
        char[] numArray = Integer.toString(number).toCharArray();
        while (numArray.length >= 2) {
            StringBuilder finStr = new StringBuilder();
            if (!isPalindrome(numArray)) {
                int[] intNumArray = new int[numArray.length / 2];
                for (int i = 0; i < numArray.length / 2; i += 2) {
                    finStr.append(numArray[i] - '0' + numArray[i + 1] - '0');
                }
                numArray = finStr.toString().toCharArray();
            }
            else {
                return true;
            }
        }
        return false;
    }


}
