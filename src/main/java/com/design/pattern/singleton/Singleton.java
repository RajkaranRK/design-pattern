package com.design.pattern.singleton;


/**
 * old way of initializing the singleton object it'll reduce the performance of the application
 * as each time when you call this method you're allowing only one thread can access this method at a time
 */
public class Singleton {

    private Singleton(){}

    private static Singleton mInstance;

    public synchronized static Singleton getInstance(){
        if(mInstance == null){
            mInstance = new Singleton();
        }
        return mInstance;
    }
}
