package com.example.myNewApp.service;

import com.example.myNewApp.dto.ProductDTO;
import com.example.myNewApp.entity.Product;
import com.example.myNewApp.repositories.ProductRepository;
import com.example.myNewApp.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    public List<ProductDTO> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return productMapper.toDtoList(products);
    }

    // Additional methods like getProductById, saveProduct, deleteProduct can go here
}