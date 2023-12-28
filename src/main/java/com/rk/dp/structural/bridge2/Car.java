package com.rk.dp.structural.bridge2;

public class Car implements Vehicle{

    private Workshop produce;
    private Workshop assemble;

    public Car(Workshop produce, Workshop assemble){
        this.produce = produce;
        this.assemble = assemble;
    }

    @Override
    public void manufacture() {
        System.out.print("Car ");
        produce.work();
        assemble.work();
    }
}
