package com.avinash.designpatterns;

class RunnableInterface implements Runnable {
    private int count;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
    }
}

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new RunnableInterface());
        Thread t2 = new Thread(new RunnableInterface());

        t1.start();
        t1.join();

    }
}

