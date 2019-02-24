package com.structural.test;

import com.structural.proxy.BankService;
import com.structural.proxy.BankServiceProxy;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void shouldAddTransactionalFunctionality1(){
        BankService service = new BankServiceProxy();
        service.deposit("453454", 90);
    }

    @Test
    public void shouldAddTransactionalFunctionality2(){
        BankService service = new BankServiceProxy();
        service.deposit("453454", -9);
    }
}
