package com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.persistence;

import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.entities.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service()
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, UUID> {
}
