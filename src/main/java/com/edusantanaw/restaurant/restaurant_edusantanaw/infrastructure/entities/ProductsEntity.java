package com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.entities;

import jakarta.persistence.*;

import java.util.Date;

@Table(name = "products")
public class ProductsEntity {
    @Id()
    @Column()
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    @Column()
    String name;
    @Column()
    Double price = 0.0;
    @Column()
    String description;
    @Column(nullable = false)
    String photo;
    @Column()
    int amount = 0;
    @ManyToOne()
    @JoinColumn(name = "restaurant")
    RestaurantEntity restaurant;
    @Column(updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    Date createdAt;
    @Column()
    int deleted = 0;
}
