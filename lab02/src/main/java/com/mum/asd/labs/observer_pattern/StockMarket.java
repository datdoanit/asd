package com.mum.asd.labs.observer_pattern;

public class StockMarket extends AbstractMarket {

    private StockBuyer buyer = new StockBuyer();
    private StockViewer viewer = new StockViewer();

    public StockMarket() {
        addObserver(buyer);
        addObserver(viewer);
    }

    public void addStock(String stockSymbol, Double price) {
        stocklist.put(stockSymbol, price);
    }

    public void update(String stockSymbol, Double price) {
        stocklist.put(stockSymbol, price);
        doNotify();
    }

}
