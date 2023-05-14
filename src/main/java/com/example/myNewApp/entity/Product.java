package com.example.myNewApp.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String description;

    @ManyToMany
    @JoinTable(
            name = "product_attribute",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "attribute_id")
    )
    private List<Attribute> attributes;

    @Column(name = "price_nett")
    private Double priceNett;

    @Column(name = "price_gross")
    private Double priceGross;

    private Integer quantity;

    @OneToMany(mappedBy = "product")
    private List<UserProductMapper> userProducts;

    // existing getters and setters

    public List<UserProductMapper> getUserProducts() {
        return userProducts;
    }

    public void setUserProducts(List<UserProductMapper> userProducts) {
        this.userProducts = userProducts;
    }
    public Product() {
    }

    public Product(Long id, String name, Category category, String description, List<Attribute> attributes, Double priceNett, Double priceGross, Integer quantity) {
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

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
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


