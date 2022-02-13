package com.sj.promotion;

import com.sj.promotion.dto.Item;
import com.sj.promotion.service.PromoEngineService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PromoEngineServiceTest {

    @DisplayName("Test PromoEngineService.doCalculate()")
    @Test
    void empty_shopping_cart() {
        PromoEngineService promoEngineService = buildCartWithItems();
        assertEquals(0.00, promoEngineService.doCalculate());
    }

    @DisplayName("Test PromoEngineService.doCalculate() with single shopping cart with single item")
    @Test
    public void total_of_single_shopping_cart() {
        PromoEngineService promoEngineService = buildCartWithItems(new Item("A", 2));
        assertEquals(100.0, promoEngineService.doCalculate());
    }

    @DisplayName("Test PromoEngineService.doCalculate() with single shopping cart with single item per item")
    @Test
    public void total_of_shopping_cart_with_single_item_from_item_type() {
        PromoEngineService promoEngineService = buildCartWithItems(
                new Item("A", 1),
                new Item("B", 1),
                new Item("C", 1));
        assertEquals(100.0, promoEngineService.doCalculate());
    }

    @DisplayName("Test PromoEngineService.doCalculate() with single shopping cart with multiple items per item")
    @Test
    public void total_of_shopping_cart_with_multiple_items_from_item_type(){
        PromoEngineService promoEngineService = buildCartWithItems(
                new Item("A", 5),
                new Item("B", 5),
                new Item("C", 1));
        assertEquals(370.00, promoEngineService.doCalculate());
    }

    private PromoEngineService buildCartWithItems(Item... items) {
        return new PromoEngineService(Arrays.asList(items));
    }


}
