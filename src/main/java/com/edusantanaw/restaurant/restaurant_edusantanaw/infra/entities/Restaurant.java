package com.edusantanaw.restaurant.restaurant_edusantanaw.infra.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity()
@Table(name = "restaurant")
@Data()
@Builder()
@AllArgsConstructor()
@NoArgsConstructor()
public class Restaurant {
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
}
