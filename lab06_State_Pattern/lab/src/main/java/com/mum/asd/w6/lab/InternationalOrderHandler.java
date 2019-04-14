package com.mum.asd.w6.lab;

public class InternationalOrderHandler extends OrderHandler {

    public InternationalOrderHandler(Order order) {
        super(order, new DomestricOrderHandler(order));
    }
    @Override
    public void handleOrder() {
        if(order.isInternational()) {
            System.out.println("InternationalOrderHandler: " + order);
            return;
        }
        nextHandler.handleOrder();
    }
}
