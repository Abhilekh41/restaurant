package com.restaurant.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.dao.MenuItemsRepo;
import com.restaurant.dao.MenuRepository;
import com.restaurant.dataObjects.MenuCategoriesEntity;
import com.restaurant.dataObjects.MenuItemsEntity;

@RestController
public class HelloController {

    private final MenuRepository menuRepository;
    private final MenuItemsRepo menuItemsRepo;
    public HelloController(MenuRepository menuRepository, MenuItemsRepo menuItemsRepo) {
        this.menuRepository = menuRepository;
        this.menuItemsRepo = menuItemsRepo;
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

    @GetMapping("/menuitems")
    public List<MenuItemsEntity> menuItems() {
        return menuItemsRepo.findAll();
    }
}
