package com.edusantanaw.restaurant.restaurant_edusantanaw.application.gateway;

import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities.Restaurant;

public interface CreateRestaurantGateway {
    Restaurant create(Restaurant data);
}
