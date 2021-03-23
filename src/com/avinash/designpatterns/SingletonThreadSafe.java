package com.avinash.designpatterns;

public class SingletonThreadSafe {
    //volatile added as object creation with new keyword has multiple steps of memory allocation, flushing into common memroy
    //Other thread, cannot see this and other threads can still see it.
    //volatile keyword will make it an atomic process
    private static volatile SingletonThreadSafe innerInstance = null;

    private SingletonThreadSafe() {
    }

    public static SingletonThreadSafe getInstance() {
        //its called lazy initialization block
        if (innerInstance == null) {
            synchronized (MySingleton.class) {
                //for double checked locking
                if (innerInstance == null) {
                    innerInstance = new SingletonThreadSafe();
                }
            }
        }
        return innerInstance;
    }
}
