package com.structural.decorator;

public class KoreanPorkBBQ extends PorkBBQDecorator {

    public KoreanPorkBBQ(PorkBBQ porkBBQ){
        super(porkBBQ);
    }

    @Override
    public void serve() {
        super.serve();
        System.out.println("Decorated with Korean style");
    }
}
