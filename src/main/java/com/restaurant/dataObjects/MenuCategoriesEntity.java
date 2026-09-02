package com.restaurant.dataObjects;

import com.restaurant.objects.MenuCategoryItems;
import com.restaurant.utils.RubroTypeConverter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "menuCategories")
@Getter
@Setter
public class MenuCategoriesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Convert(converter = RubroTypeConverter.class)
    @Column(name = "rubro", nullable = false, columnDefinition = "rubro_type")
    private RubroType rubro;

    @Column(name = "slug", nullable = false)
    private String slug;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "displayOrder")
    private Integer displayOrder;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;
}
