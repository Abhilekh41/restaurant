package com.restaurant.dataObjects;

import java.time.OffsetDateTime;
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
@Table(name = "customers")
@Getter
@Setter

public class CustomersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "whatsappId", nullable = false, updatable = false)
    private String whatsappId;

    @Column(name = "displayName", nullable = false)
    private String displayName;

    @Column(name = "phoneNumber", nullable = false )
    private String phoneNumber;

    @Column(name = "metadata", nullable = false)
    private String metadata;

    @Column(name = "createdAt", nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = "updatedAt", nullable = false)
    private OffsetDateTime updatedAt;
    
}
