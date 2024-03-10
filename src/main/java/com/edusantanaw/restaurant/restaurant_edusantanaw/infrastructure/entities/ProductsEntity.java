package com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Table(name = "products")
@Builder()
@Entity()
@Data()
@AllArgsConstructor()
@NoArgsConstructor()
public class ProductsEntity {
    @Id()
    @Column()
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;
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
    @Column()
    UUID restaurant;
    @Column(updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    Date createdAt;
    @Column()
    int deleted = 0;
}
