package com.example.myNewApp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor

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

//    private User user;

}
