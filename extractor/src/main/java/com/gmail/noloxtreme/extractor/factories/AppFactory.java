package com.gmail.noloxtreme.extractor.factories;

import com.gmail.noloxtreme.extractor.IGetStock;
import com.gmail.noloxtreme.extractor.internal.GetStock;

public class AppFactory {
    public IGetStock createGetStock() {
        return new GetStock();
    }
}
