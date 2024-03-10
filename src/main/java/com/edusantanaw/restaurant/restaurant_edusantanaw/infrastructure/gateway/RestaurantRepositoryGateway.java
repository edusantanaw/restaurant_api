package com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.gateway;

import com.edusantanaw.restaurant.restaurant_edusantanaw.application.gateway.CreateRestaurantGateway;
import com.edusantanaw.restaurant.restaurant_edusantanaw.application.gateway.LoadByIdGateway;
import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities.Restaurant;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.entities.RestaurantEntity;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.persistence.RestaurantRepository;

import java.util.Optional;
import java.util.UUID;

public class RestaurantRepositoryGateway implements CreateRestaurantGateway, LoadByIdGateway<Restaurant> {

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

    @Override
    public Optional<Restaurant> loadById(UUID id) {
        Optional<RestaurantEntity> restaurantEntity = this.restaurantRepository.findById(id);
        return restaurantEntity.map(this.restaurantEntityMapper::toDomain);
    }
}
