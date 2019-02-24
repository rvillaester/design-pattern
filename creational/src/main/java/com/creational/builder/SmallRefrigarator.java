package com.creational.builder;

public class SmallRefrigarator extends Refrigarator {

    @Override
    public String name() {
        return "Small Refrigarator";
    }

    @Override
    public double price() {
        return 1000;
    }
}
