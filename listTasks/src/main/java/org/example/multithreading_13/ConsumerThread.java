package org.example.multithreading_13;

public class ConsumerThread extends Thread{

    public ConsumerThread() {
    }

    static void decrementCounter() {
        System.out.println("--- : " + Counter.counter.decrementAndGet());
    }

    @Override
    public void run() {
        while (Counter.counter.get() > 0 && Counter.counter.get() < 100) {
            decrementCounter();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
