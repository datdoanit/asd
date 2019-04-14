package com.mum.asd.labs.lab02.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractMarket implements ISubject{
    protected final Map<String,Double> stocklist = new HashMap<String,Double>();
    private final List<IObserver> observers = new ArrayList<>();

    public Map<String, Double> getStocklist() {
        return stocklist;
    }

    @Override
    public void addObserver(IObserver observer) {
        if (observer == null || observers.contains(observer)) {
            return;
        }
        observers.add(observer);
    }

    @Override
    public void doNotify() {
        observers.stream().forEach(observer -> observer.update(stocklist));
    }
}
