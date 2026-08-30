package com.restaurant.controller;

import java.util.List;
import java.util.ArrayList;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
    @GetMapping("/")
    public String defaultEndpoint() { 
        return "Hiii!";
    }
    @GetMapping("/restaurants")
    public List<String> restaurantNames() {
        List<String> restaurants = new ArrayList<>();
        restaurants.add("Dominos");
        restaurants.add("Pizza Hut");
        restaurants.add("LaPino's Pizza");
        restaurants.add("ChicagoPizza");
        
        return restaurants;
        }

}
