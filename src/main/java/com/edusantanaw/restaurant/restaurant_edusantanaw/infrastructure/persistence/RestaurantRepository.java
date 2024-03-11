package com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.persistence;

import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.entities.RestaurantEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service()
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, UUID> {
    Page<RestaurantEntity> findByNameContaining(String search, Pageable page);
}
