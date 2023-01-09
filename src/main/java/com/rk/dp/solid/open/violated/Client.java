package com.rk.dp.solid.open.violated;

public class Client {

    public static void main(String[] args) {
        ISPSubscriber ispSubscriber = new ISPSubscriber();
        System.out.println(ispSubscriber.calculateBill());

        PhoneSubscriber phoneSubscriber = new PhoneSubscriber();
        System.out.println(phoneSubscriber.calculateBill());
    }
}
