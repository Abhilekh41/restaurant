package com.restaurant.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.restaurant.dataObjects.MenuCategoriesEntity;
import com.restaurant.dataObjects.MenuItemsEntity;
import com.restaurant.objects.MenuCategoryItems;
import com.restaurant.utils.EntityToPojoConverter;

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

    public List<MenuCategoryItems> findMenuCategoryItemsByDisplayOrder(Integer displayOrder){
        List<MenuCategoriesEntity> menuCategoriesEntities = menuCategoriesRepository.findByDisplayOrder(displayOrder);

        List<MenuCategoryItems> menuCategoryItemsList = new ArrayList<>();

        for (MenuCategoriesEntity menuCategory : menuCategoriesEntities ){
            List<MenuItemsEntity> menuItemsEntities = menuItemRepository.findByCategoryId(menuCategory.getId());

            MenuCategoryItems menuCategoryItems = EntityToPojoConverter.toMenuCategoryItems(menuCategory, menuItemsEntities);
        
            menuCategoryItemsList.add(menuCategoryItems);
        }

       



        return menuCategoryItemsList;
    }

    

    
}
