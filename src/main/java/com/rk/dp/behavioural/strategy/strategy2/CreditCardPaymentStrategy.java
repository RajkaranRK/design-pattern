package com.rk.dp.behavioural.strategy.strategy2;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paying "+amount+" though credit card");
    }
}
