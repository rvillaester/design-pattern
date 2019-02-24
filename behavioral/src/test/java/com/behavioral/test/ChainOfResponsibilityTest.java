package com.behavioral.test;

import com.behavioral.chainofresponsibility.*;
import org.junit.Test;

public class ChainOfResponsibilityTest {

    @Test
    public void shouldFilter1(){
        FilterHandler handler = new FilterHandler();
        handler.addFilter(new NumberFilter());
        handler.addFilter(new SpaceFilter());
        handler.addFilter(new LowerCaseFilter());
        String result = handler.doFilter("h43 34lsDdf 324 4  dksl");
        System.out.println(result);
    }
}
