package com.edusantanaw.restaurant.restaurant_edusantanaw.application.usecases;

import com.edusantanaw.restaurant.restaurant_edusantanaw.application.exceptions.NotFoundException;
import com.edusantanaw.restaurant.restaurant_edusantanaw.application.gateway.DeleteGateway;
import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities.Restaurant;

import java.util.Optional;
import java.util.UUID;

public class DeleteRestaurantInteractor {
    private final DeleteGateway<Restaurant> deleteGateway;

    public DeleteRestaurantInteractor(DeleteGateway deleteGateway) {
        this.deleteGateway = deleteGateway;
    }

    public Boolean delete(UUID id) throws NotFoundException {
        Optional<Restaurant> restaurant = this.deleteGateway.loadById(id);
        if(restaurant.isEmpty()) throw new NotFoundException("Restaurante não encontrado!");
        this.deleteGateway.delete(restaurant.get());
        return true;
    }
}
