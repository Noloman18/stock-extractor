package com.gmail.noloxtreme.extractor.internal;

import com.gmail.noloxtreme.extractor.IGetStock;
import com.gmail.noloxtreme.reutersApi.Stock;

public class GetStock implements IGetStock {
    @Override
    public Stock scrapeStock(String symbol) {
        Stock stock = new Stock();
        stock.setSymbol(symbol);
        return stock;
    }
}
