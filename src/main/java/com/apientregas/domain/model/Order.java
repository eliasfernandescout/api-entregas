package com.apientregas.domain.model;

import javax.persistence.*;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "number")
    private String number;
    @Column(name = "delivery_fee")
    private String deliveryFee;
    @Column(name = "has_delivery_fee")
    private String hasDeliveryFee;



}
