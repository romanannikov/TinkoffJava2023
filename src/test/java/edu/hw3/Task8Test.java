package edu.hw3;

import edu.hw3.Task8.BackwardIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task8Test {

    @Test
    @DisplayName("BackwardIterator Test")
    void testBI() {
        List<Integer> origList = List.of(1, 2, 3);
        List<Integer> resList = new ArrayList<>();
        Iterator<Integer> bIterator = new BackwardIterator<>(origList);

        while (bIterator.hasNext()) {
            resList.add(bIterator.next());
        }

        assertEquals(resList, List.of(3, 2, 1));
    }
}
