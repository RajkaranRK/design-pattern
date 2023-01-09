package com.rk.dp.solid.open;


public class ISPSubscriber extends Subscriber {

    private int freeUsage;

    public ISPSubscriber(int subscriberId, String address, long phoneNumber, int baseRate, int freeUsage) {
        super(subscriberId, address, phoneNumber, baseRate);
        this.freeUsage = freeUsage;
    }

    @Override
    public double calculateBill() {
        //do some calculation and return result
        return 0;
    }
}