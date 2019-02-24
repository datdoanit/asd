package com.mum.asd.labs.lab02.homework;

public class StockMarket extends AbstractMarket {

    private IObserver buyer = new StockBuyer();
    private IObserver viewer = new StockViewer();

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
