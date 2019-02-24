package com.creational.builder;

public class LargeRefrigator extends Refrigarator {

    @Override
    public String name() {
        return "Large Refrigarator";
    }

    @Override
    public double price() {
        return 6000;
    }
}
