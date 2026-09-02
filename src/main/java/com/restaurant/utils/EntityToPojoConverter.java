package com.restaurant.utils;

import com.restaurant.dataObjects.MenuCategoriesEntity;
import com.restaurant.dataObjects.MenuItemsEntity;
import com.restaurant.objects.MenuCategoryItems;
import com.restaurant.objects.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EntityToPojoConverter {

    public static MenuCategoryItems toMenuCategoryItems(
            MenuCategoriesEntity menuCategoriesEntity,
            List<MenuItemsEntity> menuItemsEntities) {

        MenuCategoryItems menuCategoryItems = new MenuCategoryItems();

        menuCategoryItems.setId(menuCategoriesEntity.getId());
        menuCategoryItems.setRubro(menuCategoriesEntity.getRubro());
        menuCategoryItems.setSlug(menuCategoriesEntity.getSlug());
        menuCategoryItems.setName(menuCategoriesEntity.getName());
        menuCategoryItems.setDisplayOrder(menuCategoriesEntity.getDisplayOrder());
        menuCategoryItems.setActive(menuCategoriesEntity.getActive());
        menuCategoryItems.setCreatedAt(menuCategoriesEntity.getCreatedAt());

        List<MenuItem> menuItems = new ArrayList<>();

        for(MenuItemsEntity menuItemsEntity : menuItemsEntities) {
            menuItems.add(toMenuItem(menuItemsEntity));
        }

        menuCategoryItems.setMenuItemsList(menuItems);

        return menuCategoryItems;
    }

    public static MenuItem toMenuItem(MenuItemsEntity menuItemsEntity) {

        MenuItem menuItem = new MenuItem();

        menuItem.setCategoryId(menuItemsEntity.getCategoryId());
        menuItem.setRubro(menuItemsEntity.getRubro());
        menuItem.setName(menuItemsEntity.getName());
        menuItem.setNormalizedName(menuItemsEntity.getNormalizedName());
        menuItem.setDescription(menuItemsEntity.getDescription());
        menuItem.setDineInPrice(menuItemsEntity.getDineInPrice());
        menuItem.setPickupPrice(menuItemsEntity.getPickupPrice());
        menuItem.setDeliveryPrice(menuItemsEntity.getDeliveryPrice());
        menuItem.setAvailable(menuItemsEntity.getAvailable());
        menuItem.setActive(menuItemsEntity.getActive());
        menuItem.setMetadata(menuItemsEntity.getMetadata());
        menuItem.setCreatedAt(menuItemsEntity.getCreatedAt());
        menuItem.setUpdatedAt(menuItemsEntity.getUpdatedAt());

        return menuItem;
    }
}