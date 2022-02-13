package com.sj.promotion;

import com.sj.promotion.dto.Item;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PromoEngineServiceTest {

    @DisplayName("Test PromoEngineService.doCalculate()")
    @Test
    void empty_shopping_cart() {
        PromoEngineService promoEngineService = buildCartWithItems();
        assertEquals(5.00, promoEngineService.doCalculate());
    }

    private PromoEngineService buildCartWithItems(Item... items) {
        return new PromoEngineService(Arrays.asList(items));
    }


}
