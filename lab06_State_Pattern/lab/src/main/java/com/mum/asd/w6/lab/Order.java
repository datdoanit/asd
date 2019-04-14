package com.mum.asd.w6.lab;

public class Order {
    private int orderNumber;
    private int totalAmount;
    private boolean international;
    private final Customer customer;

    public Order(int orderNumber, int totalAmount, boolean international, Customer customer) {
        this.orderNumber = orderNumber;
        this.totalAmount = totalAmount;
        this.international = international;
        this.customer = customer;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isInternational() {
        return international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", totalAmount=" + totalAmount +
                ", international=" + international +
                ", customer=" + customer +
                '}';
    }
}
