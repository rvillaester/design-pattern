package com.structural.test;

import com.structural.decorator.*;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void shouldDecorate(){
        PorkBBQ porkBBQ = new PorkBBQDecorator(
                new PorkBBQTacos(
                        new KoreanPorkBBQ(
                                new NormalPorkBBQ()
                        )
                )
        );

        porkBBQ.serve();
    }
}
