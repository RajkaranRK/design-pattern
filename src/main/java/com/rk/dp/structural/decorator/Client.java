package com.rk.dp.structural.decorator;

public class Client {
    
    public static void main(String[]args) {
        Message message = new TextMessage("Good Morning");
        System.out.println("Plain text message "+message.getContent());
        System.out.println("Encrypted message "+new Base64EncodedMessage(message).getContent());
    }

}
