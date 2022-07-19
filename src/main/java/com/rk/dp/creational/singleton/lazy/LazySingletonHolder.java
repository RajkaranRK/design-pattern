package com.rk.dp.creational.singleton.lazy;

public class LazySingletonHolder {
    
    private LazySingletonHolder() {}
    
    public static class SingletonHolder {
        
        private SingletonHolder() {}
        
        private static LazySingletonHolder instance = new LazySingletonHolder();
        
        public static LazySingletonHolder getInstance() {
            return instance;
        }
        
    }

}
