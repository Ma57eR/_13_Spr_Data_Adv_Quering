package com.example.advquerying.repositories;

import com.example.advquerying.entities.Shampoo;
import com.example.advquerying.entities.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

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
}
