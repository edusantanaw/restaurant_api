package com.edusantanaw.restaurant.restaurant_edusantanaw.application.usecases;

import com.edusantanaw.restaurant.restaurant_edusantanaw.application.exceptions.NotFoundException;
import com.edusantanaw.restaurant.restaurant_edusantanaw.application.gateway.LoadByIdGateway;
import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities.Restaurant;

import java.util.Optional;
import java.util.UUID;

public class LoadRestaurantInteractor {
    private  final LoadByIdGateway<Restaurant> restaurantLoadByIdGateway;

    public LoadRestaurantInteractor(LoadByIdGateway<Restaurant> restaurantLoadByIdGateway) {
        this.restaurantLoadByIdGateway = restaurantLoadByIdGateway;
    }

    public Restaurant loadById(UUID id) throws NotFoundException {
        Optional<Restaurant> restaurant =  this.restaurantLoadByIdGateway.loadById(id);
        if(restaurant.isEmpty()) throw new NotFoundException("Restaurante não encontrado!");
        return restaurant.get();
    }
}
