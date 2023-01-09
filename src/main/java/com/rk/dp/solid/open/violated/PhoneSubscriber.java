package com.rk.dp.solid.open.violated;

import lombok.Data;
import lombok.Getter;

@Data
public class PhoneSubscriber {

    private int subscriberId;

    private String address;

    private long phoneNumber;

    private int baseRate;

    public double calculateBill(){
        //do some calculation and return the result;
        return 0.0;
    }
}
