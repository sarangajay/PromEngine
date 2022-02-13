package com.sj.promotion;

import com.sj.promotion.dto.Item;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class PromoEngineService {

    private final List<Item> items;

    public PromoEngineService(List<Item> items) {
        this.items = items;
    }


    public Double doCalculate() {
        AtomicReference<Double> total = new AtomicReference<>(0.00);

        return total.get();

    }
}