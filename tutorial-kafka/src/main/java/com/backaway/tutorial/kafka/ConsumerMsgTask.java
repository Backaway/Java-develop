package com.backaway.tutorial.kafka;

import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;

/**
 * @author Backaway
 *
 */
public class ConsumerMsgTask implements Runnable {
    private KafkaStream stream;
    private int threadNumber;

    public ConsumerMsgTask(KafkaStream stream, int threadNumber) {
        this.threadNumber = threadNumber;
        this.stream = stream;
    }

    @Override
    public void run() {
        ConsumerIterator<byte[], byte[]> it = stream.iterator();
        while (it.hasNext()) {
            System.out.println("Thread " + threadNumber + ": " + new String(it.next().message()));
        }
        System.out.println("Shutting down Thread: " + threadNumber);
    }
}
