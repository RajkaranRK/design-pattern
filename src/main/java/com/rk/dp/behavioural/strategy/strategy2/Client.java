package com.rk.dp.behavioural.strategy.strategy2;

public class Client {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.checkout(100);

        shoppingCart.setPaymentStrategy(new CreditCardPaymentStrategy());
        shoppingCart.checkout(200);
    }
}
