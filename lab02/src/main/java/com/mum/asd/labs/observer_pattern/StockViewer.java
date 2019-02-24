package com.mum.asd.labs.observer_pattern;

import java.util.Iterator;
import java.util.Map;

public class StockViewer implements IObserver {

    @Override
    public void update(Map<String, Double> stockList) {
        System.out.println("StockViewer: stocklist is changed:");
        Iterator iter = stockList.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            String key = (String) entry.getKey();
            Double value = (Double) entry.getValue();
            System.out.println("StockViewer" + key + " - $" + value);
        }
    }
}
