package com.mum.asd.w6.lab;

import java.util.ArrayList;
import java.util.List;

public class MostFavoredCustomer {
    private List<Customer> customers = new ArrayList<>();

    public void addFavoredCustomer(Customer customer) {
        customers.add(customer);
    }

    public boolean isFavoredCustomer(Customer customer) {
        return customers.contains(customer);
    }
}
