package com.example.myNewApp.config;

import com.example.myNewApp.entity.Product;
import com.example.myNewApp.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository) {
        return args -> {
            productRepository.save(new Product("The Witcher 3: Wild Hunt", "CD Projekt Red", 19.99));
            productRepository.save(new Product("Cyberpunk 2077", "CD Projekt Red", 59.99));
            productRepository.save(new Product("Red Dead Redemption 2", "Rockstar Games", 39.99));
        };
    }
}
