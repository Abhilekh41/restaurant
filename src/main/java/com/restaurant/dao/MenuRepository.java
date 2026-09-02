package com.restaurant.dao;

import com.restaurant.dataObjects.MenuCategoriesEntity;
import com.restaurant.dataObjects.MenuItemsEntity;
import com.restaurant.objects.MenuCategoryItems;
import com.restaurant.utils.EntityToPojoConverter;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MenuRepository {

    private final  MenuCategoriesRepository menuCategoriesRepository;
    private final MenuItemsRepository menuItemRepository;

    public MenuRepository(MenuCategoriesRepository repository, MenuItemsRepository menuItemRepository) {
        this.menuCategoriesRepository = repository;
        this.menuItemRepository = menuItemRepository;
    }

    public MenuCategoryItems findMenuCategoryItemsByMenuId(UUID menuId){
        Optional<MenuCategoriesEntity> menuCategoriesEntity = menuCategoriesRepository.findById(menuId);
        if(menuCategoriesEntity.isPresent()){
            List<MenuItemsEntity> menuItemsEntities = menuItemRepository.findByCategoryId(menuId);
            return EntityToPojoConverter.toMenuCategoryItems(menuCategoriesEntity.get(), menuItemsEntities);
        }
        return null;
    }
}
