package com.example.advquerying.services;

import com.example.advquerying.entities.Ingredient;
import com.example.advquerying.repositories.IngredientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;


@Service
public class IngredientServiceImpl implements IngredientService {
    private final IngredientRepository ingredientRepository;

    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public List<Ingredient> findByListOfIngredientsOrderByPriceDesc(List<String> names) {
        return this.ingredientRepository.findByNameInOrderByPriceAsc(names);
    }

    @Override
    //@Transactional
    public int deleteByName(String nettle) {
        return this.ingredientRepository.deleteByName(nettle);
    }

    @Override
    public void increasePriceWithTenPercent(BigDecimal price) {
        this.ingredientRepository.increasePriceWithTenPercent(price);
    }


}


