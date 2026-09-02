package com.restaurant.controller;


import java.util.List;
import java.util.UUID;

import com.restaurant.dao.MenuRepository;
import com.restaurant.objects.MenuCategoryItems;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.dao.MenuItemsRepository;
import com.restaurant.dao.MenuCategoriesRepository;
import com.restaurant.dataObjects.MenuCategoriesEntity;
import com.restaurant.dataObjects.MenuItemsEntity;

@RestController
public class MenuController {

    private final MenuCategoriesRepository menuCategoriesRepository;
    private final MenuItemsRepository menuItemsRepository;
    public MenuRepository menuRepository;

    public MenuController(MenuCategoriesRepository menuCategoriesRepository, MenuItemsRepository menuItemsRepository, MenuRepository menuRepository) {
        this.menuCategoriesRepository = menuCategoriesRepository;
        this.menuItemsRepository = menuItemsRepository;
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
        return menuCategoriesRepository.findAll();
    }

    @GetMapping("/menuitems")
    public List<MenuItemsEntity> menuItems() {
        return menuItemsRepository.findAll();
    }

    @GetMapping("menuCategoryItem/{id}")
    public MenuCategoryItems getMenuCategoriesItems(@PathVariable UUID id) {
        return menuRepository.findMenuCategoryItemsByMenuId(id);
    }
}
