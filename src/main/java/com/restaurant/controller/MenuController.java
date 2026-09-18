package com.restaurant.controller;


import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.dao.CartItemsRepository;
import com.restaurant.dao.MenuCategoriesRepository;
import com.restaurant.dao.MenuItemsRepository;
import com.restaurant.dao.MenuRepository;
import com.restaurant.dataObjects.CartItemsEntity;
import com.restaurant.dataObjects.MenuCategoriesEntity;
import com.restaurant.dataObjects.MenuItemsEntity;
import com.restaurant.objects.MenuCategoryItems;



@RestController
public class MenuController {

    private final MenuCategoriesRepository menuCategoriesRepository;
    private final MenuItemsRepository menuItemsRepository;
    public MenuRepository menuRepository;
    private final CartItemsRepository cartItemsRepository;

    public MenuController(MenuCategoriesRepository menuCategoriesRepository, MenuItemsRepository menuItemsRepository, MenuRepository menuRepository, CartItemsRepository cartItemsRepository) {
        this.menuCategoriesRepository = menuCategoriesRepository;
        this.menuItemsRepository = menuItemsRepository;
        this.menuRepository = menuRepository;
        this.cartItemsRepository = cartItemsRepository;
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

    @GetMapping("/cartitems")
    public List<CartItemsEntity> cartItems(){
        return cartItemsRepository.findAll();
    }

    @GetMapping("menuCategoryItem/categoryId/{id}")
    public MenuCategoryItems getMenuCategoriesItems(@PathVariable UUID id) {
        return menuRepository.findMenuCategoryItemsByMenuId(id);
    }
    
    @GetMapping("menuCategoryItem/displayOrder/{displayOrder}")
    public List<MenuCategoryItems> getMenuCategoryItems(@PathVariable Integer displayOrder) {
        return menuRepository.findMenuCategoryItemsByDisplayOrder(displayOrder);
    }

    @PostMapping("/menuCategoryItem/{id}")
    public MenuCategoryItems createMenuCategoryItem(@PathVariable UUID id){
            
        return menuRepository.findMenuCategoryItemsByMenuId(id);
    }


} 

