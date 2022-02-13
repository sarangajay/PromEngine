package com.sj.promotion.service;

import com.sj.promotion.dao.ProductInventoryStore;
import com.sj.promotion.dto.Item;
import com.sj.promotion.type.PromotionI;
import com.sj.promotion.type.SingleItemPromotion;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class PromoEngineService {

    private final List<Item> items;

    private ProductCostCalculator productCostCalculator;


    public PromoEngineService(List<Item> items) {
        this.items = items;
        this.productCostCalculator = new ProductCostCalculator(new ProductInventoryStore());
    }


    public Double doCalculate() {
        AtomicReference<Double> total = new AtomicReference<>(0.00);
        Reflections reflections = new Reflections("com.sj.promotion.type");
        Set<Class<? extends PromotionI>> subTypes = reflections.getSubTypesOf(PromotionI.class);
        for(Class<? extends PromotionI> curClass : subTypes) {
            try {
                if(!Modifier.isAbstract(curClass.getModifiers())) {
                    PromotionI promotionService = curClass.newInstance();
                    total.set(promotionService.calculate(this.items) + total.get());               }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        total.set(getTotal() + total.get());
        return total.get();
    }

    private double getTotal() {
        AtomicReference<Double> total = new AtomicReference<>(0.00);
        items.stream().forEach(
                e -> {
                    total.set(this.productCostCalculator.calculateProductCost(e, total.get()));
                }
        );
        return total.get();
    }
}
