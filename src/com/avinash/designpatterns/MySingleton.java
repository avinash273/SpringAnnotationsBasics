package com.avinash.designpatterns;

//this is not thread safe
public class MySingleton {
    private static MySingleton innerInstance = null;

    private MySingleton() {

    }

    public static  MySingleton getInstance() {
        //both thread1 and thread2 can step into too
        if (innerInstance == null) {
            innerInstance = new MySingleton();
        }
        return innerInstance;
    }
}
