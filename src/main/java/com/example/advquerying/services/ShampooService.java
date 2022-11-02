package com.example.advquerying.services;

import com.example.advquerying.entities.Ingredient;
import com.example.advquerying.entities.Shampoo;
import com.example.advquerying.entities.Size;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public interface ShampooService {


    List<Shampoo> selectBySize(Size size);

    List<Shampoo> selectBySizeOrLabelId(Size medium, Long i);

    List<Shampoo> selectByPrice(BigDecimal v);

    List<Ingredient> selectByStartingLetter(String letter);


    int countByPriceLowerThan(BigDecimal valueOf);


}
