package com.sj.promotion.dto;

public class Item {
    private final String itemName;

    private final Integer quantity;

    private boolean processed ;

    public Item(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }
}
