package com.rk.dp.creational.factory.simple;

public class Client {
    
    
    public static void main(String[]args) {
        Account account = null;
        account = SimpleFactory.getAccount("silver");
        System.out.println(account);
        account = SimpleFactory.getAccount("gold");
        System.out.println(account);
        account = SimpleFactory.getAccount("platinum");
        System.out.println(account);
    }

}
