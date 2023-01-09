package com.rk.dp.solid.open;

import lombok.AllArgsConstructor;
import lombok.Data;

public class PhoneSubscriber extends Subscriber{

    public PhoneSubscriber(int subscriberId, String address, long phoneNumber, int baseRate) {
        super(subscriberId, address, phoneNumber, baseRate);
    }

    @Override
    public double calculateBill() {
        //do some calculation and return the result
        return 0;
    }
}
