package com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Builder()
@Entity()
@Data()
@AllArgsConstructor()
@NoArgsConstructor()
@Table(name = "restaurant")
public class RestaurantEntity {
    @Id()
    @Column()
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
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
    @Column(updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    Date createdAt;
    @Column()
    int deleted = 0;
}
