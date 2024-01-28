package com.rk.dp.behavioural.observer;

public class QuantityObserver implements OrderObserver{

    @Override
    public void update(Order order) {
        int count = order.getCount();
        if(count <=5){
            order.setShippingCost(10.00);
        }else{
            order.setShippingCost(10.00 * count - 4);
        }
        System.out.println("Item count updated to "+ count);
    }
}
