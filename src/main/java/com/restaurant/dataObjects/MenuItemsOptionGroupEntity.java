package com.restaurant.dataObjects;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Embeddable
@Getter
@Setter
@EqualsAndHashCode
public class MenuItemsOptionGroupEntity implements Serializable {

    @Column(name = "menuItemId")
    private UUID menuItemId;

    @Column(name = "optionGroupId")
    private UUID optionGroupId;
}
