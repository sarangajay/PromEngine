package com.sj.promotion;

import java.util.concurrent.atomic.AtomicReference;

public class PromoEngineService {


    public Double doCalculate() {
        AtomicReference<Double> total = new AtomicReference<>(0.00);

        return total.get();

    }
}