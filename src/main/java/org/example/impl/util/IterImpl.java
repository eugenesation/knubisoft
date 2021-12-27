package org.example.impl.util;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class IterImpl implements Iterable {

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }


}
