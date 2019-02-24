package com.creational.builder;

public class LEDTelevision extends Television {

    @Override
    public String name() {
        return "LED Television";
    }

    @Override
    public double price() {
        return 50000;
    }
}
