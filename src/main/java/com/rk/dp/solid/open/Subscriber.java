package com.rk.dp.solid.open;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * This class
 * is close for modification(by making the field as final and method as final)
 * but open for extension(by providing an abstract method to override by the child class)
 */
@Data
@AllArgsConstructor
public abstract class Subscriber {

    private final int subscriberId;

    private final String address;

    private final long phoneNumber;

    private final int baseRate;

    public abstract double calculateBill();
}
