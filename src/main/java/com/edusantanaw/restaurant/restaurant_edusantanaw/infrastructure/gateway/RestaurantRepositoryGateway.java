package com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.gateway;

import com.edusantanaw.restaurant.restaurant_edusantanaw.application.gateway.CreateRestaurantGateway;
import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities.Restaurant;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.entities.RestaurantEntity;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.persistence.RestaurantRepository;

public class RestaurantRepositoryGateway implements CreateRestaurantGateway {

    private final RestaurantRepository restaurantRepository;
    private  final RestaurantEntityMapper restaurantEntityMapper;

    public RestaurantRepositoryGateway(RestaurantRepository restaurantRepository, RestaurantEntityMapper restaurantEntityMapper) {
        this.restaurantRepository = restaurantRepository;
        this.restaurantEntityMapper = restaurantEntityMapper;
    }

    public Restaurant create(Restaurant data) {
        RestaurantEntity restaurant = this.restaurantEntityMapper.toEntity(data);
        this.restaurantRepository.save(restaurant);
        return this.restaurantEntityMapper.toDomain(restaurant);
    }
}
