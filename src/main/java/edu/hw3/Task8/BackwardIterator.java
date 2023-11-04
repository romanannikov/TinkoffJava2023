package edu.hw3.Task8;

import java.util.Iterator;
import java.util.List;

public class BackwardIterator<T> implements Iterator<T> {

    private final List<T> aList;
    private int curPos;

    public BackwardIterator(List<T> aList) {
        this.aList = aList;
        this.curPos = aList.size() - 1;
    }
    @Override
    public boolean hasNext() {
        return curPos >= 0 && aList.get(curPos) != null;
    }

    @Override
    public T next() {
        return aList.get(curPos--);
    }
}
