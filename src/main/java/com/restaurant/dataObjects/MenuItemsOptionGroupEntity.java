package com.restaurant.dataObjects;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "menu_item_option_groups")
@Getter
@Setter
public class MenuItemsOptionGroupEntity {

    @Column(name = "menuItemId", nullable = false, updatable = false)
    private UUID menuItemId;

    @Column(name = "optionGroupId", nullable = false, updatable = false)
    private UUID optionGroupId;
    
}
