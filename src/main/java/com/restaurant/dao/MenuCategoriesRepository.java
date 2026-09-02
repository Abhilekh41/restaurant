package com.restaurant.dao;

import com.restaurant.dataObjects.MenuCategoriesEntity;
import com.restaurant.dataObjects.MenuItemsEntity;
import com.restaurant.objects.MenuCategoryItems;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MenuCategoriesRepository extends JpaRepository<MenuCategoriesEntity, UUID> {
}
