package com.restaurant.controller;

import java.util.ArrayList;
import java.util.List;

import com.restaurant.dao.MenuRepository;
import com.restaurant.dataObjects.MenuCategoriesEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final MenuRepository menuRepository;

    public HelloController(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/")
    public String defaultEndpoint() { 
        return "Hiii!";
    }
    
    @GetMapping("/restaurants")
    public List<MenuCategoriesEntity> restaurantNames() {
        return menuRepository.findAll();
    }
}
