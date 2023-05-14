package com.example.myNewApp.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_product")
public class UserProductMapper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


}