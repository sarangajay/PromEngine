package com.sj.promotion.dao;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ProductInventoryStore {

    private final Map inventory = new ConcurrentHashMap<String, Double>(){{
        put("A",50.00);
        put("B",30.00);
        put("C",20.00);
        put("D",15.00);
    }};

    public Map<String, Double> getInventory() {
        return inventory;
    }
}
