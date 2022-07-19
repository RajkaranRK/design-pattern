package com.rk.dp.creational.singleton.lazy;

public final class LazySingleton {
    
    private LazySingleton() {}
    
    private static volatile LazySingleton instance;
    
    public static LazySingleton getInstance() {
        if(instance == null) {
            synchronized (LazySingleton.class) {
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
