package com.restaurant.dao;

import java.util.Optional;
import java.util.UUID;

import com.restaurant.dataObjects.CartItemsEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemsRepository extends JpaRepository<CartItemsEntity, UUID> {
    Optional<CartItemsEntity> findById(UUID id);
}
