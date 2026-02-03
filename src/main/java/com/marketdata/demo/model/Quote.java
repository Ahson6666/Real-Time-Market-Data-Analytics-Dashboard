package com.marketdata.demo.model;

public class Quote {
    private String symbol;
    private double price;
    private double sma20;
    private double volume;
    
    public Quote(String symbol, double price, double sma20, double volume) {
        this.symbol = symbol;
        this.price = price;
        this.sma20 = sma20;
        this.volume = volume;
    }
    
    public boolean isAboveSma() {
        return price > sma20;
    }
}
