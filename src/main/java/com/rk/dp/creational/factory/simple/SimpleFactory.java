package com.rk.dp.creational.factory.simple;

public class SimpleFactory {
    
    public static Account getAccount(String type) {
        Account account = null;
        switch (type) {
        case "gold":
            account = new GoldAccount();
            break;
        case "silver":
            account = new SilverAccount();
            break;
        default:
            throw new IllegalArgumentException("Invalid Account type");
        }
        return account;
    }

}
