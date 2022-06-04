package com.design.pattern.singleton;

/**
 * creating the singleton object using the double
 * checking method
 */
public class Singleton2 {

    private Singleton2(){

    }

    //adding the volatile as no thread cache this object in it's local stack
    private volatile static Singleton2 mInstance;

    public static Singleton2 getInstance(){
        if(mInstance == null){
            synchronized (Singleton2.class){
                if(mInstance == null){
                    mInstance = new Singleton2();
                }
            }
        }
        return mInstance;
    }
}
