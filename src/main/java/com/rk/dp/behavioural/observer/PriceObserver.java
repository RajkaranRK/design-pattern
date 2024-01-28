package com.rk.dp.behavioural.observer;

public class PriceObserver implements OrderObserver {

    @Override
    public void update(Order order) {
        double cost = order.getTotal();
        if(cost >= 200 && cost < 500){
            order.setDiscount(10.00);
        }else if(cost >= 500){
            order.setDiscount(30.00);
        }
        System.out.println("Item cost updated to "+ cost);
    }

}
