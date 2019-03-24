package com.mum.asd.w6.lab;

public class MostFavoredCustomerOrderHandler extends OrderHandler {

    private final MostFavoredCustomer mostFavoredCustomer = new MostFavoredCustomer();

    public MostFavoredCustomerOrderHandler(Order order) {
        super(order, new LargeOrderHandler(order));
    }

    @Override
    public void handleOrder() {
       if (mostFavoredCustomer.isFavoredCustomer(order.getCustomer())) {
           System.out.println("MostFavoredCustomerOrderHandler - " + order);
           return;
       }
       nextHandler.handleOrder();
    }
}
