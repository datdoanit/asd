package com.mum.asd.labs.lab02.homework;

public class Application {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        market.addStock("ORC", 12.23);
        market.addStock("MSC", 45.78);
        market.update("ORC", 12.34);
        market.update("MSC", 44.68);
    }
}
