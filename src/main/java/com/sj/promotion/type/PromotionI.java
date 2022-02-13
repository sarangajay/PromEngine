package com.sj.promotion.type;

import com.sj.promotion.dto.Item;

import java.util.List;

public interface PromotionI {
    Double calculate(List<Item> items);
}
