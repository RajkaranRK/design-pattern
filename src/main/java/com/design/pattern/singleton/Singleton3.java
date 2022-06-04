package com.design.pattern.singleton;

/**
 * define the singleton object using the inner class
 * it's also a type of lazy loading
 */
public class Singleton3 {

    private Singleton3(){}

    public static class Builder {

        private static Singleton3 mInstance = new Singleton3();

        public static Singleton3 getInstance(){
            return mInstance;
        }

    }
}
