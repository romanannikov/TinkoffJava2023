package edu.hw3;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task5 {

    private Task5() {
    }

    public static ArrayList<String> parseContacts(List<String> contacts, String param) {
        Comparator<String> nameComparator = new NameComparator();
        contacts.sort(nameComparator);
        if (param.equals("DESC")) {
            return new ArrayList<>(contacts.reversed());
        }
        return new ArrayList<>(contacts);
    }
}
