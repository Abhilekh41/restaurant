package com.restaurant.dataObjects;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class OrdersEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;

    @Column(name = "order_number", insertable = false, updatable = false)
    private Long orderNumber;

    @Column(name = "customer_id", nullable = false)
    private UUID customerId;

    @Column(name = "cart_id", unique = true)
    private UUID cartId;

    
    @Column(name = "rubro", nullable = false)
    private RubroType rubro;

    
    @Column(name = "fulfillment_type", nullable = false)
    private FulfillmentType fulfillmentType;

    
    @Column(name = "payment_method", nullable = false)
    private PaymentMethodType paymentMethod;

    
    @Column(name = "payment_status", nullable = false)
    private PaymentStatusType paymentStatus;

    
    @Column(name = "status", nullable = false)
    private OrderStatusType status;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_phone")
    private String customerPhone;

    @Column(name = "delivery_address")
    private String deliveryAddress;

    @Column(name = "delivery_reference")
    private String deliveryReference;

    @Column(name = "items_total", nullable = false, precision = 10, scale = 2)
    private BigDecimal itemsTotal;

    @Column(name = "delivery_fee", precision = 10, scale = 2)
    private BigDecimal deliveryFee;

    @Column(name = "total", nullable = false, precision = 10, scale = 2)
    private BigDecimal total;

    @Column(name = "currency", nullable = false, length = 3)
    private String currency;

    @Column(name = "idempotency_key", unique = true)
    private String idempotencyKey;

    @Column(name = "placed_at")
    private OffsetDateTime placedAt;

    @Column(name = "change_window_ends_at")
    private OffsetDateTime changeWindowEndsAt;

    @Column(name = "metadata")
    private String metadata;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt;

    
}