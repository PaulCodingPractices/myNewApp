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
            productRepository.save(new Product("The Witcher 3: Wild Hunt", 19.99));
            productRepository.save(new Product("Cyberpunk 2077", 59.99));
            productRepository.save(new Product("Red Dead Redemption 2", 39.99));
        };
    }
}
