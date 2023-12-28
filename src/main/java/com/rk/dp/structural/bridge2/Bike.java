package com.rk.dp.structural.bridge2;

public class Bike implements Vehicle{
    private Workshop produce;
    private Workshop assemble;

    public Bike(Workshop produce, Workshop assemble){
        this.produce = produce;
        this.assemble = assemble;
    }

    @Override
    public void manufacture() {
        System.out.print("Bike ");
        produce.work();
        assemble.work();
    }
}
