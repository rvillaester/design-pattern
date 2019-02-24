package com.structural.facade;

public class CustomerServiceFacade {

    private OrderService orderService = new OrderService();
    private ShippingService shippingService = new ShippingService();
    private BillingService billingService = new BillingService();

    public void serve(){
        orderService.getOrder();
        billingService.computeBill();
        shippingService.shipOrder();
    }
}
