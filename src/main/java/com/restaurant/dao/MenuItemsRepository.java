package com.restaurant.dao;

import java.util.List;
import java.util.UUID;

import com.restaurant.dataObjects.MenuCategoriesEntity;
import com.restaurant.objects.MenuCategoryItems;
import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.dataObjects.MenuItemsEntity;

public interface MenuItemsRepository extends JpaRepository<MenuItemsEntity, UUID> {
    List<MenuItemsEntity> findByCategoryId(UUID categoryId);
}
