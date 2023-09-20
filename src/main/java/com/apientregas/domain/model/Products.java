package com.apientregas.domain.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "picture_url")
    private String pictureUrl;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "available")
    private Double isAvailable;
}
