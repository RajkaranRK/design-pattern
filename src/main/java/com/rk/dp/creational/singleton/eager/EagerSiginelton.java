package com.rk.dp.creational.singleton.eager;

public class EagerSiginelton {
    
    private EagerSiginelton() {}
    
    private static EagerSiginelton instance = new EagerSiginelton();
    
    
    public static EagerSiginelton getInstance() {
        return instance;
    }

}
