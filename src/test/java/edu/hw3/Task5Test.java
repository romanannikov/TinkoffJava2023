package edu.hw3;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5Test {
    private static final ArrayList<String> CONTACTS =
        new ArrayList<>(Arrays.asList("John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes"));
    private static final ArrayList<String> EXP_ASC_SORTED_CONTACTS =
        new ArrayList<>(Arrays.asList("Thomas Aquinas", "Rene Descartes", "David Hume", "John Locke"));
    private static final ArrayList<String> EXP_DESC_SORTED_CONTACTS =
        new ArrayList<>(Arrays.asList("John Locke", "David Hume", "Rene Descartes", "Thomas Aquinas"));

    @Test
    void parseContactsTest() {

        ArrayList<String> ascSortedContacts = Task5.parseContacts(CONTACTS, "ASC");
        ArrayList<String> descSortedContacts = Task5.parseContacts(CONTACTS, "DESC");

        assertEquals(ascSortedContacts, EXP_ASC_SORTED_CONTACTS);
        assertEquals(descSortedContacts, EXP_DESC_SORTED_CONTACTS);
    }
}
