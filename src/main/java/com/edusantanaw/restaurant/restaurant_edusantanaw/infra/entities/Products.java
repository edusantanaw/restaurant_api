package com.edusantanaw.restaurant.restaurant_edusantanaw.infra.entities;

import jakarta.persistence.*;

@Table(name = "products")
public class Products extends Default {
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
    Restaurant restaurant;
}
