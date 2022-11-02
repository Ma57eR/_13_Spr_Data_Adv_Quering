package com.example.advquerying.services;

import com.example.advquerying.entities.Ingredient;
import com.example.advquerying.entities.Shampoo;
import com.example.advquerying.entities.Size;
import com.example.advquerying.repositories.ShampooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Service
public class ShampooServiceImpl implements ShampooService {
    private final ShampooRepository shampooRepository;

    @Autowired
    public ShampooServiceImpl(ShampooRepository shampooRepository) {
        this.shampooRepository = shampooRepository;
    }


    @Override
    public List<Shampoo> selectBySize(Size size) {

        return this.shampooRepository.findBySizeOrderById(size);

    }

    @Override
    public List<Shampoo> selectBySizeOrLabelId(Size size, Long i) {
        return this.shampooRepository.findBySizeOrLabelIdOrderByPrice(size, i);
    }

    @Override
    public List<Shampoo> selectByPrice(BigDecimal price) {
        return this.shampooRepository.findByPriceGreaterThanOrderByPriceDesc(price);
    }

    @Override
    public List<Ingredient> selectByStartingLetter(String letter) {
        return this.shampooRepository.findByIngredientsStartingWith(letter);
    }

    @Override
    public int countByPriceLowerThan(BigDecimal price) {
        return this.shampooRepository.countDistinctByPriceLessThan(price);

    }

}
