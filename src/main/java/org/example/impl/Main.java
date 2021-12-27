package org.example.impl;

import org.example.impl.util.MyList;

import java.util.Iterator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();

        for (int i = 0; i < 20; i++) {
            Entity entity = new Entity(i);
            myList.add(entity);
        }
        for (int i = 0; i < myList.size() - 1; i++) {
            System.out.println(myList.get(i));
        }

        Iterator<Object> iterator = myList.iterator();
        System.out.println("Random value: ");
        System.out.println(selectRandom(iterator, new Random()));
    }

    public static <T> T selectRandom(final Iterator<T> iter, final Random random) {
        if (!iter.hasNext()) {
            throw new IllegalArgumentException();
        }
        if (random == null) {
            throw new NullPointerException();
        }
        T selected = iter.next();
        int count = 1;
        while (iter.hasNext()) {
            final T current = iter.next();
            ++count;
            if (random.nextInt(count) == 0) {
                selected = current;
            }
        }
        return selected;
    }
}
