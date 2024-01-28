package com.rk.dp.creational.singleton.rulebreak;

import java.io.Serializable;

public class Singleton implements Serializable {

    private Singleton(){}


    private static volatile Singleton singleton;


    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }


    //this method ensure that no multiple instance of this class should created while de-serializing the object
    private Object readResolve(){
        return singleton;
    }

}
