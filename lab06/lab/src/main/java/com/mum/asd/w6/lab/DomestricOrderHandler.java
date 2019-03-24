package com.mum.asd.w6.lab;

public class DomestricOrderHandler extends OrderHandler {

    public DomestricOrderHandler(Order order) {
        super(order, null);
    }
    @Override
    public void handleOrder() {
        System.out.println("DomestricOrderHandler: " + order);
    }
}
