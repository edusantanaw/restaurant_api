package com.edusantanaw.restaurant.restaurant_edusantanaw.application.usecases;

import com.edusantanaw.restaurant.restaurant_edusantanaw.application.gateway.CreateRestaurantGateway;
import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities.Restaurant;

public class CreateRestaurantInteractor {
    private final CreateRestaurantGateway createRestaurantGateway;
    public CreateRestaurantInteractor(CreateRestaurantGateway gateway){
        this.createRestaurantGateway = gateway;
    }

   public Restaurant create(Restaurant data){
            return this.createRestaurantGateway.create(data);
    }
}
