package com.example.myNewApp.entity;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<UserProductMapper> userProducts;

    public User() {
    }

    public User(String firstName, String lastName, String email, String password) {

    }

    // existing getters and setters

    public List<UserProductMapper> getUserProducts() {
        return userProducts;
    }

    public void setUserProducts(List<UserProductMapper> userProducts) {
        this.userProducts = userProducts;
    }
}
