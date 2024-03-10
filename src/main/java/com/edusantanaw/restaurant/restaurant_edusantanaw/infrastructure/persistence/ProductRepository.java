package com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.persistence;

import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.entities.ProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<ProductsEntity, UUID> {
}
