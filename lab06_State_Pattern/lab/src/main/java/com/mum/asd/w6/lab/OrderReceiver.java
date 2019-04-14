package com.mum.asd.w6.lab;

public class OrderReceiver {

    public static void execute(Order order) {
        new MostFavoredCustomerOrderHandler(order).handleOrder();
    }

}
