package com.restaurant.dataObjects;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.UUID;
import com.restaurant.utils.RubroTypeConverter;

@Entity
@Table(name = "sessions")
@Getter
@Setter

public class SessionsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "customerId", nullable = false, unique = true)
    private UUID customerId;

    @Convert(converter = RubroTypeConverter.class)
    @Column(name = "activeRubro", columnDefinition = "rubro_type")
    private RubroType activeRubro;

    @Column(name = "conversationState", nullable = false)
    private String conversationState;

    @Column(name = "activeCartId")
    private UUID activeCartId;

    @Column(name = "context", nullable = false, columnDefinition = "TEXT")
    private String context;

    @Column(name = "lastMessageAt", nullable = false)
    private OffsetDateTime lastMessageAt;

    @Column(name = "createdAt", nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = "updatedAt", nullable = false)
    private OffsetDateTime updatedAt;
}
