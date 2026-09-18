package com.restaurant.dataObjects;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "cartItems")
@Getter
@Setter
public class CartItemsEntity {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false, unique = true)
    private UUID id;

    @Column(name = "cartId", nullable = false)
    private UUID cartId;

    @Column(name = "menuItemId", nullable = false)
    private UUID menuItemId;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "selectedOptions", nullable = false, columnDefinition = "TEXT")
    private String selectedOptions;

    @Column(name = "notes")
    private String notes;

    @Column(name = "createdAt", nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = "updatedAt", nullable = false)
    private OffsetDateTime updatedAt;



    
}
