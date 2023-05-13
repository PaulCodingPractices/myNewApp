package com.example.myNewApp.service;

import com.example.myNewApp.dto.ProductDTO;
import com.example.myNewApp.entity.Product;
import com.example.myNewApp.mapper.ProductMapper;
import com.example.myNewApp.repositories.ProductRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.jetbrains.annotations.NotNull;
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
    public ProductDTO getProductById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id " + id));
        return productMapper.toDto(product);
    }
    public ProductDTO saveProduct(@NotNull ProductDTO productDTO) {
        Product product;

        if (productDTO.getId() != null && productRepository.existsById(productDTO.getId())) {
            product = productRepository.findById(productDTO.getId()).get();
            product.setQuantity(product.getQuantity() + productDTO.getQuantity());
        } else {
            product = productMapper.toEntity(productDTO);
            product.setQuantity(productDTO.getQuantity()); // Set initial quantity
        }

        Product savedProduct = productRepository.save(product);
        return productMapper.toDto(savedProduct);
    }
    public void deleteProduct(Long id) {
        if(!productRepository.existsById(id)) {
            throw new ResourceNotFoundException("Product not found with id " + id);
        }
        productRepository.deleteById(id);
    }
}