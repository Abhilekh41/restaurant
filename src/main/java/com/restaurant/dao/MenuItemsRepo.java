package com.restaurant.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.dataObjects.MenuItemsEntity;

public interface MenuItemsRepo extends JpaRepository<MenuItemsEntity, UUID> {

}
