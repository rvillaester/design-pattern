package com.creational.builder.test;

import com.creational.builder.ApplianceBuilder;
import com.creational.builder.ApplianceItems;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuilderTest {

    private ApplianceBuilder builder;

    @Before
    public void init(){
        builder = new ApplianceBuilder();
    }

    @Test
    public void shouldReturnCorrectTotalPrice1(){
        ApplianceItems items = builder.getCrtTvAndLargeRef();
        Assert.assertEquals(6500.0, items.getTotalPrice());
    }

    @Test
    public void shouldReturnCorrectTotalPrice2(){
        ApplianceItems items = builder.get2LedTvAndMediumRef();
        Assert.assertEquals(103000.0, items.getTotalPrice());
    }
}
