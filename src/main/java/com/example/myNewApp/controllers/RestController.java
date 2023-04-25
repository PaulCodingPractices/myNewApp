package com.example.myNewApp.controllers;
import org.springframework.web.bind.annotation.*;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @PostMapping("/add")
    public int addNumbers(@RequestParam int num1, @RequestParam int num2) {
        return num1 + num2;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable long id) {
        // code to delete entity with given id
    }
}
