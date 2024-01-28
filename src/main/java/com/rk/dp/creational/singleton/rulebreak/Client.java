package com.rk.dp.creational.singleton.rulebreak;

import java.io.*;

public class Client {

    private static final String FILE_NAME = "singleton.ser";
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        serializeObject(singleton);
        Singleton deserializeInstance = deserializeObject();
        System.out.println(deserializeInstance);
    }


    public static void serializeObject(Singleton singleton){
        try(FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(singleton);
        }catch(Exception e){
            System.out.println("There is some error while serializing the object: "+e.getMessage());
        }
    }

    public static Singleton deserializeObject(){
        try(FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis)){
            return (Singleton) ois.readObject();
        }catch (Exception e){
            System.out.println("There is some error while de-serializing the object: "+e.getMessage());
        }
        return null;
    }
}
