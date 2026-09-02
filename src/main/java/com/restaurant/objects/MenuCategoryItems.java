package com.restaurant.objects;

import com.restaurant.dataObjects.RubroType;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class MenuCategoryItems {
    private UUID id;
    private RubroType rubro;
    private String slug;
    private String name;
    private Integer displayOrder;
    private Boolean active;
    private OffsetDateTime createdAt;
    private List<MenuItem> menuItemsList;
}


