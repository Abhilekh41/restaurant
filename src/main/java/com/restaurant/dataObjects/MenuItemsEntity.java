package com.restaurant.dataObjects;

import java.time.OffsetDateTime;
import java.util.UUID;

import com.restaurant.utils.RubroTypeConverter;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "menuItems")
@Getter
@Setter

public class MenuItemsEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    
    
    @Column(name = "categoryId", nullable = false)
    private UUID categoryId;


    @Convert(converter = RubroTypeConverter.class)
    @Column(name = "rubro", nullable = false, columnDefinition = "rubro_type")
    private RubroType rubro;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "normalizedName", nullable = false)
    private String normalizedName;

    @Column(name = "description")
    private String description;

    @Column(name = "dineInPrice", nullable = false)
    private Double dineInPrice;

    @Column(name = "pickupPrice", nullable = false)
    private Double pickupPrice;

    @Column(name = "deliveryPrice")
    private Double deliveryPrice;

    @Column(name = "available", nullable = false)
    private Boolean available;

    @Column(name = "active", nullable = false)
    private Boolean active;

    @Column(name = "metadata", nullable = false)
    private String metadata;

    @Column(name = "createdAt", nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = "updatedAt", nullable = false)
    private OffsetDateTime updatedAt;






}

