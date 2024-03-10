package com.edusantanaw.restaurant.restaurant_edusantanaw.services;

import com.edusantanaw.restaurant.restaurant_edusantanaw.controllers.restaurant.dtos.CreateRestaurantDto;
import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities.RestaurantEntity;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infra.entities.Restaurant;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infra.gateway.RestaurantGateway;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
@AllArgsConstructor()
public class RestaurantService {
    @Autowired
    private final RestaurantGateway restaurantGateway;

    public Restaurant create(CreateRestaurantDto data) {
        RestaurantEntity restaurant = new RestaurantEntity(
                data.getName(),
                data.getPerfilPhoto(),
                data.getDescription(),
                data.getCategories(),
                false
        );
        Restaurant createdRestaurant = this.restaurantGateway.create(restaurant);
        return createdRestaurant;
    }
}
