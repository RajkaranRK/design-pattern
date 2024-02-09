package com.rk.dp.behavioural.strategy.strategy2;

public class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    public ShoppingCart(){
        paymentStrategy = new WalletPaymentStrategy(); // default strategy used if strategy not provided by the client
    }


    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount){
        paymentStrategy.pay(amount);
    }

}
