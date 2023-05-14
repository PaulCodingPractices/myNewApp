package com.example.myNewApp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Attribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "attributes")
    private List<Product> products;
}