package com.apientregas.domain.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "number")
    private String number;
    @Column(name = "delivery_fee")
    private BigDecimal deliveryFee;
    @Column(name = "has_delivery_fee")
    private String hasDeliveryFee;



}
