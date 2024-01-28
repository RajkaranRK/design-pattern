package com.rk.dp.behavioural.observer;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Order {

    private String id;

    private double total;

    private int count;

    private double discount; // this field will be updated by the price observer


    private double shippingCost; // this field will be updated by the quantity observer



    private List<OrderObserver> observers;

    public Order(String id){
        this.id = id;
        observers = new ArrayList<>();
    }

    public void attach(OrderObserver observer){
        observers.add(observer);
    }

    public void detach(OrderObserver observer){
        if(Objects.isNull(observers)){
            return;
        }
        observers.remove(observer);
    }


    private void notifyObserver(){
        this.observers.forEach(observer -> observer.update(this));
    }


    public void addItem(double cost){
        this.total += cost;
        count++;
        notifyObserver();
    }

    public double getTotal(){
        return total - discount + shippingCost;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }

    public  double getDiscount(){
        return discount;
    }

    public int getCount(){
        return count;
    }

    public void setShippingCost(double shippingCost){
        this.shippingCost = shippingCost;
    }

    public double getShippingCost(){
        return shippingCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", total=" + total +
                ", count=" + count +
                ", discount=" + discount +
                ", shippingCost=" + shippingCost +
                '}';
    }
}
