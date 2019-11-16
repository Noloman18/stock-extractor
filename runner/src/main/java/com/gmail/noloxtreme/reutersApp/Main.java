package com.gmail.noloxtreme.reutersApp;

import com.gmail.noloxtreme.extractor.IGetStock;
import com.gmail.noloxtreme.extractor.factories.AppFactory;
import com.gmail.noloxtreme.reutersApi.Stock;

public class Main {

    public static void main(String[] args) {
        AppFactory appFactory = new AppFactory();
        IGetStock test = appFactory.createGetStock();
        Stock stock = test.scrapeStock("SGL");
        System.out.println(stock);
    }
}
