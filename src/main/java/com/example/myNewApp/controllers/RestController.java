package com.example.myNewApp.controllers;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


@org.springframework.web.bind.annotation.RestController
public class RestController {



    @Value("${category.name}")
    private String categoryName;

    @Value("${author.name}")
    private String AuthorName;

    @GetMapping("/soundsinfo")
    public String getSoundtrackInfo() {
        return "Category: " + categoryName + "Author " + AuthorName;
    }
}
