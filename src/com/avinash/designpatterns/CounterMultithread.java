package com.avinash.designpatterns;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
//    AtomicInteger count = new AtomicInteger();
    private int count;

    public synchronized void increment() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
    }
    public int getCount(){
        return count;
    }
}

public class CounterMultithread {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable runnable = () -> {
            c.increment();
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.getCount());
    }
}
