package com.mum.asd.w6.lab;

public class LargeOrderHandler extends OrderHandler {

    private static final int LARGE_ORDER_AMOUNT = 30000;
    public LargeOrderHandler(Order order) {
        super(order, new InternationalOrderHandler(order));
    }

    @Override
    public void handleOrder() {
        if(order.getTotalAmount() > LARGE_ORDER_AMOUNT) {
            System.out.println("LargeOrderHandler: " + order);
            return;
        }
        nextHandler.handleOrder();
    }
}
