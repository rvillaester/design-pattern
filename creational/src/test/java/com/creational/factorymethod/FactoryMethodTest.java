package com.creational.factorymethod;

import org.junit.gen5.api.Assertions;
import org.junit.gen5.api.BeforeAll;
import org.junit.gen5.api.Test;

public class FactoryMethodTest {

    @Test
    public void testMcdonaldsRate(){
        FriedChickenStore store = FriedChickenStoreFactory.getFriedChickenStore(StoreType.MCDONALDS);
        Assertions.assertEquals(360.0, store.calculateBill(3));
    }

    @Test
    public void testJollibeeRate(){
        FriedChickenStore store = FriedChickenStoreFactory.getFriedChickenStore(StoreType.JOLLIBEE);
        Assertions.assertEquals(300.0, store.calculateBill(2));
    }

    @Test
    public void testKennyRogersRate(){
        FriedChickenStore store = FriedChickenStoreFactory.getFriedChickenStore(StoreType.KENNYROGERS);
        Assertions.assertEquals(500.0, store.calculateBill(5));
    }


}
