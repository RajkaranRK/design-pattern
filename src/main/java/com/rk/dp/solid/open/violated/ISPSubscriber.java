package com.rk.dp.solid.open.violated;

import lombok.Data;


/**
 * This class is violating the Open-closed principle
 * as we have two classes and having some common parameter
 * and this class is not extending any class
 *  and let's say if a new service been added then we have to create a new class
 *  and all the common field will be added again, which is a redundant code
 *
 */
@Data
public class ISPSubscriber {
    private int subscriberId;

    private String address;

    private long phoneNumber;

    private int baseRate;

    private int freeUsage;

    public double calculateBill(){
        //do some calculation and return calculated bill
        return 0.0;
    }
}
