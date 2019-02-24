package com.structural.decorator;

public class NormalPorkBBQ implements PorkBBQ {

    @Override
    public void serve() {
        System.out.println("Normal Pork BBQ");
    }
}
