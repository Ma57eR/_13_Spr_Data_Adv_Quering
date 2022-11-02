package com.example.advquerying.services;

import com.example.advquerying.entities.Ingredient;
import org.springframework.transaction.annotation.Transactional;


import java.math.BigDecimal;
import java.util.List;


public interface IngredientService {

    List<Ingredient> findByListOfIngredientsOrderByPriceDesc(List<String> strings);


    int deleteByName(String nettle);

    @Transactional
    void increasePriceWithTenPercent(BigDecimal price);
}
