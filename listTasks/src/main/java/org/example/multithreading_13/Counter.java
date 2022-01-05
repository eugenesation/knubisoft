package org.example.multithreading_13;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    static AtomicInteger counter = new AtomicInteger(50);

    public AtomicInteger getCounter() {
        return counter;
    }

    public void setCounter(AtomicInteger counter) {
        counter = counter;
    }
}
