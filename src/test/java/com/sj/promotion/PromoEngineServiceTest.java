package com.sj.promotion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PromoEngineServiceTest {

    @DisplayName("Test PromoEngineService.doCalculate()")
    @Test
    void empty_shopping_cart() {
        PromoEngineService promoEngineService = new PromoEngineService();
        assertEquals(5.00, promoEngineService.doCalculate());
    }


}
