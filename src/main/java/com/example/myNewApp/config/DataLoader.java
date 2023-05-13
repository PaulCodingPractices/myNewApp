package com.example.myNewApp.config;

import com.example.myNewApp.dto.ProductDTO;
import com.example.myNewApp.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(ProductService productService) {
        return args -> {
            /*** Updating this in the future , currently problems with compatibility
             * productService.saveProduct(ProductDTO.builder()
                    .name("The Witcher 3: Wild Hunt")
                    .priceNett(19.99)
                    .priceGross(19.99 * 1.2)
                    .quantity(1)
                    .build());

            productService.saveProduct(ProductDTO.builder()
                    .name("Cyberpunk 2077")
                    .priceNett(59.99)
                    .priceGross(59.99 * 1.2)
                    .quantity(1)
                    .build());

            productService.saveProduct(ProductDTO.builder()
                    .name("Red Dead Redemption 2")
                    .priceNett(39.99)
                    .priceGross(39.99 * 1.2)
                    .quantity(1)
                    .build());
             */
            productService.saveProduct(new ProductDTO(
                    null,
                    "The Witcher 3: Wild Hunt",
                    null,
                    null,
                    null,
                    19.99,
                    19.99 * 1.2,
                    1
            ));

            productService.saveProduct(new ProductDTO(
                    null,
                    "Cyberpunk 2077",
                    null,
                    null,
                    null,
                    59.99,
                    59.99 * 1.2,
                    1
            ));

            productService.saveProduct(new ProductDTO(
                    null,
                    "Red Dead Redemption 2",
                    null,
                    null,
                    null,
                    39.99,
                    39.99 * 1.2,
                    1
            ));
        };
    }
}