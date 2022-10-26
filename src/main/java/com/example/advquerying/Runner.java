package com.example.advquerying;

import com.example.advquerying.repositories.ShampooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;
import java.util.Set;


@Component
public class Runner implements CommandLineRunner {
    private final ShampooRepository shampooRepository;

    @Autowired
    public Runner(ShampooRepository shampooRepository) {
        this.shampooRepository = shampooRepository;
    }

    @Override
    public void run(String... args) {

//        this.shampooRepository.countByBrand("Cotton Fresh")
//                .forEach(shampoo -> System.out.println(shampoo.getId()));


        //System.out.println(shampooRepository.countByBrand("Cotton Fresh"));

        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        Set<String> names = Set.of(first, second);

        this.shampooRepository.findByIngredientsName(names)
                .forEach(System.out::println);

//        String size = scanner.nextLine();
//
//        Size currentSize = Size.valueOf(size);

//        this.shampooRepository.findBySizeOrderById(currentSize)
//                .forEach(shampoo -> {
//                    System.out.printf("%s | %s | %.2f%n", shampoo.getBrand(), shampoo.getSize(), shampoo.getPrice());
//                });


    }
}
