package edu.hw3;

import java.util.Comparator;

public class NameComparator implements Comparator<String> {

    @Override
    public int compare(String name1, String name2) {
        String[] name1Array = name1.split(" ");
        String[] name2Array = name2.split(" ");
        return name1Array[name1Array.length - 1].compareTo(name2Array[name2Array.length - 1]);
    }
}
