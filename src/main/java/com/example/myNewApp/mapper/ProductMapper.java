package com.example.myNewApp.mapper;

import com.example.myNewApp.dto.AttributeDTO;
import com.example.myNewApp.dto.ProductDTO;
import com.example.myNewApp.entity.Attribute;
import com.example.myNewApp.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDTO toDto(Product product);

    Product toEntity(ProductDTO productDto);

    List<ProductDTO> toDtoList(List<Product> productList);

    List<Product> toEntityList(List<ProductDTO> productDtoList);

    AttributeDTO toDto(Attribute attribute);

    Attribute toEntity(AttributeDTO attributeDto);

    List<AttributeDTO> toDtoListAttribute(List<Attribute> attributeList);

    List<Attribute> toEntityListAttribute(List<AttributeDTO> attributeDtoList);
}