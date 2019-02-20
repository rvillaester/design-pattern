package com.creational.factorymethod.test;


import com.creational.factorymethod.FriedChickenStore;
import com.creational.factorymethod.FriedChickenStoreFactory;
import com.creational.factorymethod.StoreType;
import org.junit.Assert;
import org.junit.Test;

public class FactoryMethodTest {

    @Test
    public void testMcdonaldsRate(){
        FriedChickenStore store = FriedChickenStoreFactory.getFriedChickenStore(StoreType.MCDONALDS);
        Assert.assertEquals(360.0, store.calculateBill(3));
    }

    @Test
    public void testJollibeeRate(){
        FriedChickenStore store = FriedChickenStoreFactory.getFriedChickenStore(StoreType.JOLLIBEE);
        Assert.assertEquals(300.0, store.calculateBill(2));
    }

    @Test
    public void testKennyRogersRate(){
        FriedChickenStore store = FriedChickenStoreFactory.getFriedChickenStore(StoreType.KENNYROGERS);
        Assert.assertEquals(500.0, store.calculateBill(5));
    }


}
