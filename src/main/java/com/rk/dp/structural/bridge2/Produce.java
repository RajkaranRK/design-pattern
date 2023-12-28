package com.rk.dp.structural.bridge2;

public class Produce implements Workshop {
    @Override
    public void work() {
        System.out.print("Produced");
    }
}
