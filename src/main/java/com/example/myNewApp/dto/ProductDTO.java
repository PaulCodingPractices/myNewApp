package com.example.myNewApp.dto;

import com.example.myNewApp.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private Long id;
    private String name;
    private Category category;
    private String description;
    private List<AttributeDTO> attributes;
    private Double priceNett;
    private Double priceGross;
}