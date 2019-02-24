package com.creational.builder;

public class LCDTelevision extends Television {

    @Override
    public String name() {
        return "LCD Television";
    }

    @Override
    public double price() {
        return 5000;
    }
}
