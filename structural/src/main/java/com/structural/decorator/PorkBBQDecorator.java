package com.structural.decorator;

public class PorkBBQDecorator implements PorkBBQ {

    private PorkBBQ porkBBQ;

    public PorkBBQDecorator(PorkBBQ porkBBQ){
        this.porkBBQ = porkBBQ;
    }

    @Override
    public void serve() {
        porkBBQ.serve();
    }
}
