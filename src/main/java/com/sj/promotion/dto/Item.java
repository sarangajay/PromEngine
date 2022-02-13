package com.sj.promotion.dto;

public class Item {
    private String itemName;

    private Integer quantity;

    private boolean processed ;

    public Item(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }
}
