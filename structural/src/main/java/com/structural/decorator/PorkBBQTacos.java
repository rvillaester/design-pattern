package com.structural.decorator;

public class PorkBBQTacos extends PorkBBQDecorator {

    public PorkBBQTacos(PorkBBQ porkBBQ){
        super(porkBBQ);
    }

    @Override
    public void serve() {
        super.serve();
        System.out.println("Wrapped with Tacos");
    }
}
