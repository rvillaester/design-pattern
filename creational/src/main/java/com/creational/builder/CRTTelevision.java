package com.creational.builder;

public class CRTTelevision extends Television {

    @Override
    public String name() {
        return "Small Television";
    }

    @Override
    public double price() {
        return 500;
    }
}
