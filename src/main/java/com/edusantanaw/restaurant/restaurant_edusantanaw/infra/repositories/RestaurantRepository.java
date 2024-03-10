package com.edusantanaw.restaurant.restaurant_edusantanaw.infra.repositories;

import com.edusantanaw.restaurant.restaurant_edusantanaw.infra.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service()
public interface RestaurantRepository extends JpaRepository<Restaurant, UUID> {
}
