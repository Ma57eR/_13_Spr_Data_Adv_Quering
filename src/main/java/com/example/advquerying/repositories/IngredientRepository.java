package com.example.advquerying.repositories;

import com.example.advquerying.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

    List<Ingredient> findByNameInOrderByPriceAsc(List<String> names);


    int deleteByName(String nettle);


    @Modifying
    @Query("UPDATE Ingredient i SET i.price = i.price * :price")
    void increasePriceWithTenPercent(BigDecimal price);
}
