package com.restaurant.dao;

import com.restaurant.dataObjects.MenuCategoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MenuCategoriesRepository extends JpaRepository<MenuCategoriesEntity, UUID> {
    List<MenuCategoriesEntity> findByDisplayOrder(Integer displayOrder);
}
