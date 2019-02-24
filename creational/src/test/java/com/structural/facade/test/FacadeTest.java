package com.structural.facade.test;

import com.structural.facade.CustomerServiceFacade;
import org.junit.Test;

public class FacadeTest {

    @Test
    public void shouldPresentAFacadeOfComplexSystem(){
        CustomerServiceFacade customerServiceFacade = new CustomerServiceFacade();
        customerServiceFacade.serve();
    }
}
