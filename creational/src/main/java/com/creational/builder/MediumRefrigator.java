package com.creational.builder;

public class MediumRefrigator extends Refrigarator {

    @Override
    public String name() {
        return "Medium Refrigarator";
    }

    @Override
    public double price() {
        return 3000;
    }
}
