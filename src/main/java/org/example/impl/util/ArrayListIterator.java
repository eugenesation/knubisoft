package org.example.impl.util;

import java.util.Iterator;

public class ArrayListIterator<T extends Object> implements Iterator<T> {

    private int size = 0;
    T[] values;

    public ArrayListIterator(T[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return size < values.length;
    }

    @Override
    public T next() {
        return values[size++];
    }
}
