package edu.hw3;

public class Task1 {

    private static final int SIZE = 'z' - 'a';

    private Task1() {
    }

    public static String atbash(String word) {
        char[] wordArray = word.toCharArray();
        StringBuilder encodedWord = new StringBuilder();
        for (char tempChar : wordArray) {
            if ('a' <= tempChar && tempChar <= 'z') {
                encodedWord.append((char) ('a' + SIZE - (tempChar - 'a')));
            } else if ('A' <= tempChar && tempChar <= 'Z') {
                encodedWord.append((char) ('A' + SIZE - (tempChar - 'A')));
            } else {
                encodedWord.append(tempChar);
            }
        }
        return encodedWord.toString();
    }


}
