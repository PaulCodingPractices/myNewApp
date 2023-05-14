package com.example.myNewApp.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;


/***
 * Entity that stores information about users adress information, and to added it to database.
 */
@Entity
@Table(name = "adress")
@NoArgsConstructor
public class Adress {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;
    private String address;
    private String state;
    private String city;
    private String zip;



}
