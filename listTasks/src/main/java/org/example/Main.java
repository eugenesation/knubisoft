package org.example;

import org.example.serialization_11.binary.BinarySerialization;

import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {
//        ProducerThread producerThread = new ProducerThread();
//        ConsumerThread consumerThread = new ConsumerThread();
//        ConsumerThread consumerThread1 = new ConsumerThread();
//        Thread thread3 = new Thread(consumerThread1);
//        Thread thread1 = new Thread(producerThread);
//        Thread thread2 = new Thread(consumerThread);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();

        BinarySerialization.serializeAndDeserialize();

    }
}
