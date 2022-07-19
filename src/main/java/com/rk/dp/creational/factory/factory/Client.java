package com.rk.dp.creational.factory.factory;

public class Client {
    
    public static void main(String []args) {
        Message message = new TextMessageCreator().createMessage("Greeting", "Good Morning");
        System.out.println(message);
        System.out.println(message.encrypt());
        System.out.println(message.getMsg());
        
        
        message = new JsonMessage("Greeting", "Good Morning");
        System.out.println(message);
        System.out.println(message.encrypt());
        System.out.println(message.getMsg());
    }

}
