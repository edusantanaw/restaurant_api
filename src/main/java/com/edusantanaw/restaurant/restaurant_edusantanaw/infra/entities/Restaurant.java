package com.edusantanaw.restaurant.restaurant_edusantanaw.infra.entities;

import jakarta.persistence.*;

@Table(name = "restaurant")
public class Restaurant extends Default {
    @Column(nullable = false)
    String name;
    @Column()
    String perfilPhoto;
    @Column()
    String description;
    @Column()
    String categories;
    @Column()
    int open = 0;
}
