package com.mum.asd.labs.observer_pattern;

import java.util.Map;

public interface IObserver {
    void update(Map<String, Double> stockList);
}
