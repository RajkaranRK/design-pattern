package com.rk.dp.behavioural.observer;

public class Client {

    public static void main(String[] args) {

        Order order = new Order("order#1");

        PriceObserver priceObserver = new PriceObserver();
        order.attach(priceObserver);

        QuantityObserver quantityObserver = new QuantityObserver();
        order.attach(quantityObserver);


        order.addItem(50);
        order.addItem(179);
        System.out.println(order);

    }
}
