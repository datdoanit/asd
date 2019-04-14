package com.mum.asd.labs.lab02.homework;

import java.util.Map;

public interface IObserver {
    void update(Map<String, Double> stockList);
}
