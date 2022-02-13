package com.sj.promotion.type;

import com.sj.promotion.dao.ProductInventoryStore;

public abstract class AbstractPromotion implements PromotionI {

    protected ProductInventoryStore productInventoryStore;

    protected AbstractPromotion() {
        this.productInventoryStore = new ProductInventoryStore();
    }
}
