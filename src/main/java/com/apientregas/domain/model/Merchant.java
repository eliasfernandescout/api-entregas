package com.apientregas.domain.model;

import javax.persistence.*;
@Entity
@Table(name = "merchant")
public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "logo_url")
    private String logoUrl;
    @Column(name = "category")
    private String category;
    @Column(name = "subcategory")
    private String subcategory;
    @Column(name = "isAvailable")
    private boolean isAvailable;
    @Column(name = "description")
    private String description;
}
