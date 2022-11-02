package com.example.advquerying.repositories;

import com.example.advquerying.entities.Ingredient;
import com.example.advquerying.entities.Shampoo;
import com.example.advquerying.entities.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Repository
public interface ShampooRepository extends JpaRepository<Shampoo, Long> {


    Integer countByBrand(String brand);

    List<Shampoo> findBySizeOrderById(Size size);

    @Query("SELECT s FROM Shampoo s " +
            "JOIN s.ingredients as i " +
            "WHERE i.name IN :ingredientNames")
    List<Shampoo> findByIngredientsName(Set<String> ingredientNames);

    List<Shampoo> findBySizeOrLabelIdOrderByPrice(Size size,Long i);

    List<Shampoo> findByPriceGreaterThanOrderByPriceDesc(BigDecimal price);

    @Query("select i from Ingredient i " +
            "where i.name like CONCAT('%',:letter,'%')")
    List<Ingredient> findByIngredientsStartingWith(String letter);

    int countDistinctByPriceLessThan(BigDecimal price);

}
