package com.restaurant.dataObjects;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "options")
@Getter
@Setter
public class OptionsEntity {
    @Id @GeneratedValue(strategy = GenerationType.UUID) 
    @Column(name = "id", nullable = false, updatable = false) 
    private UUID id;
    
    @Column(name = "option_group_id", nullable = false) 
    private UUID optionGroupId;
    
    @Column(name = "name", nullable = false) 
    private String name;
    
    @Column(name = "price_delta", nullable = false, precision = 10, scale = 2) 
    private BigDecimal priceDelta;
    
    @Column(name = "active", nullable = false) 
    private Boolean active;
    
    @Column(name = "display_order", nullable = false) 
    private Integer displayOrder;
}
