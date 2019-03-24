package com.mum.asd.w6.lab;

public abstract class OrderHandler {
    protected final OrderHandler nextHandler;
    protected final Order order;

    public OrderHandler(Order order,OrderHandler nextHandler) {
        this.order = order;
        this.nextHandler = nextHandler;
    }

    public abstract void handleOrder();
}
