package com.restaurant.objects;

import com.restaurant.dataObjects.RubroType;
import com.restaurant.utils.RubroTypeConverter;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
public class MenuItem {
    private UUID categoryId;
    private RubroType rubro;
    private String name;
    private String normalizedName;
    private String description;
    private Double dineInPrice;
    private Double pickupPrice;
    private Double deliveryPrice;
    private Boolean available;
    private Boolean active;
    private String metadata;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
}
