package com.gmail.noloxtreme.extractor;

import com.gmail.noloxtreme.reutersApi.Stock;

public interface IGetStock {
    Stock scrapeStock(String symbol);
}
