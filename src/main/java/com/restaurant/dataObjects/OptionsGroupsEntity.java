package com.restaurant.dataObjects;

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
@Table(name = "optionGroups")
@Getter
@Setter

public class OptionsGroupsEntity {

    @Id 
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Convert(converter = RubroTypeConverter.class)
    @Column(name = "rubro", nullable = false, columnDefinition = "rubro_type")
    private RubroType rubro;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "selection_min", nullable = false)
    private Integer selectionMin;

    @Column(name = "selection_max")
    private Integer secetionMax;

    @Column(name = "required", nullable = false)
    private Boolean required = false;

    @Column(name = "active", nullable = false)
    private Boolean active = true;

    @Column(name = "metadata", nullable = false)
    private String metadata;

}
