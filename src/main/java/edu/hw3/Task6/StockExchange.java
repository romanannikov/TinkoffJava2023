package edu.hw3.Task6;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class StockExchange implements StockMarket {

    private PriorityQueue<Stock> market = new PriorityQueue<>(Comparator.comparingDouble(Stock::price).reversed());

    @Override
    public void add(Stock stock) {
        market.add(stock);
    }

    @Override
    public void remove(Stock stock) {
        market.remove(stock);
    }

    @Override
    public Stock mostValuableStock() {
        return market.peek();
    }
}
