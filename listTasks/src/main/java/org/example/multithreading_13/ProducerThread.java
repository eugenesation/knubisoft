package org.example.multithreading_13;

public class ProducerThread extends Thread {

    public ProducerThread() {
    }

    static void incrementCounter() {
        System.out.println("++++ " + Counter.counter.incrementAndGet());
    }

    @Override
    public void run() {
        while (Counter.counter.get() > 0 && Counter.counter.get() < 100) {
            incrementCounter();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
