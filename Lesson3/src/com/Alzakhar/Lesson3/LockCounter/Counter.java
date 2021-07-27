package com.Alzakhar.Lesson3.LockCounter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
   private long count = 0L;
   private final static Lock lock = new ReentrantLock();

    public void increase() {
        try {
            lock.lock();
            count++;
        }finally {
            lock.unlock();
        }
    }

    public long getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10; j++) {
                        counter.increase();
                    }
                }
            }).start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println(counter.getCount());
    }
}
