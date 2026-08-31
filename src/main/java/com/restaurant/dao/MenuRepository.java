package com.restaurant.dao;

import com.restaurant.dataObjects.MenuCategoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MenuRepository extends JpaRepository<MenuCategoriesEntity, UUID> {

}
