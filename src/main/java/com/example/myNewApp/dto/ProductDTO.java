package com.example.myNewApp.dto;

import com.example.myNewApp.entity.Category;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
public class ProductDTO {

    private Long id;
    private String name;
    private Category category;
    private String description;
    private List<AttributeDTO> attributes;
    private Double priceNett;
    private Double priceGross;
    private Integer quantity;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, Category category, String description, List<AttributeDTO> attributes, Double priceNett, Double priceGross, Integer quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.attributes = attributes;
        this.priceNett = priceNett;
        this.priceGross = priceGross;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<AttributeDTO> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeDTO> attributes) {
        this.attributes = attributes;
    }

    public Double getPriceNett() {
        return priceNett;
    }

    public void setPriceNett(Double priceNett) {
        this.priceNett = priceNett;
    }

    public Double getPriceGross() {
        return priceGross;
    }

    public void setPriceGross(Double priceGross) {
        this.priceGross = priceGross;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}