package com.edusantanaw.restaurant.restaurant_edusantanaw.infra.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity()
@Data()
@Builder()
@NoArgsConstructor()
public class Default {
    @Id()
    @Column()
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    @Column(updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    Date createdAt;
    @Column()
    int deleted = 0;
}
