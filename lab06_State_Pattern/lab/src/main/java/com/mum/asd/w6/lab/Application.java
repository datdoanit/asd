package com.mum.asd.w6.lab;

public class Application {

    public static void main(String[] args) {
        Order order = new Order(1, 7000, false, new Customer("Dat"));
        OrderReceiver.execute(order);
    }
}
