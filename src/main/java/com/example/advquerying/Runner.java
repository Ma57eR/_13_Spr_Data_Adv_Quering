package com.example.advquerying;

import com.example.advquerying.entities.Shampoo;
import com.example.advquerying.services.IngredientService;
import com.example.advquerying.services.ShampooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;


@Component
public class Runner implements CommandLineRunner {

    private final ShampooService shampooService;
    private final IngredientService ingredientService;

    @Autowired
    public Runner(ShampooService shampooService, IngredientService ingredientService) {
        this.shampooService = shampooService;
        this.ingredientService = ingredientService;
    }


    @Override
    public void run(String... args) {


        /*
        //1. Select Shampoos by Size
        this.shampooService.selectBySize(Size.MEDIUM)
                .forEach(System.out::println);
         */

        /*
        //2. Select Shampoos by Size or Label
        this.shampooService.selectBySizeOrLabelId(Size.MEDIUM, 10L)
                .forEach(System.out::println);
         */

        //3. Select Shampoos by Price
//        this.shampooService.selectByPrice(BigDecimal.valueOf(5))
//                .forEach(System.out::println);

        //4. Select Ingredients by Name
//        this.shampooService.selectByStartingLetter("M")
//                .forEach(System.out::println);

        //5. Select Ingredients by Names
//        this.ingredientService.findByListOfIngredientsOrderByPriceDesc(List.of("Lavender, Herbs, Apple"))
//                .forEach(System.out::println);

        //6. Count Shampoos by Price
//        int productsCount = this.shampooService.countByPriceLowerThan(BigDecimal.valueOf(8.50));
//
//        System.out.println(productsCount);

        //7. Select Shampoos by Ingredients


        //9. Delete Ingredients by Name

        //this.ingredientService.deleteByName("Nettle");

        //10. Update Ingredients by Price
        this.ingredientService.increasePriceWithTenPercent(BigDecimal.valueOf(1.1));

//        {this.shampooRepository.countByBrand("Cotton Fresh")
//                .forEach(shampoo -> System.out.println(shampoo.getId()));
//
//
//        System.out.println(shampooRepository.countByBrand("Cotton Fresh"));
//
//        /*
//                    Example 1
//         */
//
//
//        String size = scanner.nextLine();
//
//        Size currentSize = Size.valueOf(size);
//
//        this.shampooRepository.findBySizeOrderById(currentSize)
//                .forEach(shampoo -> {
//                    System.out.printf("%s | %s | %.2f%n", shampoo.getBrand(), shampoo.getSize(), shampoo.getPrice());
//                });
//
//        Scanner scanner = new Scanner(System.in);
//
//        String first = scanner.nextLine();
//        String second = scanner.nextLine();
//
//        Set<String> names = Set.of(first, second);
//
//        this.shampooRepository.findByIngredientsName(names)
//                .forEach(System.out::println);}



    }
}
