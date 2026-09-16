package com.restaurant.dataObjects;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.UUID;
import com.restaurant.utils.RubroTypeConverter;

@Entity
@Table(name = "Carts")
@Getter
@Setter
public class CartsEntity {

    @Id 
    @GeneratedValue(strategy=GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "customerId", nullable = false)
    private UUID customerId;

    @Convert(converter = RubroTypeConverter.class)
    @Column(name = "rubro", nullable = false, columnDefinition = "rubro_type")
    private RubroType rubro;

    @Column(name = "fulfillmentType")
    private FulfillmentType fulfillmentType;

    @Column(name = "status", nullable = false)
    private String status = "active";

    @Column(name = "idempotency_key", unique = true)
    private String idempotencyKey;

    @Column(name = "metadata", nullable = false)
    private String metadata;

    @Column(name = "createdAt", nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = "updatedAt", nullable = false)
    private OffsetDateTime updatedAt;


    
}
