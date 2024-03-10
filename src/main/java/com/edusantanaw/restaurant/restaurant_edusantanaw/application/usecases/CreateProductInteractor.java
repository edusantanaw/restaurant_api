package com.edusantanaw.restaurant.restaurant_edusantanaw.application.usecases;

import com.edusantanaw.restaurant.restaurant_edusantanaw.application.exceptions.NotFoundException;
import com.edusantanaw.restaurant.restaurant_edusantanaw.application.gateway.CreateProductGateway;
import com.edusantanaw.restaurant.restaurant_edusantanaw.application.gateway.LoadByIdGateway;
import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities.Products;
import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities.Restaurant;

import java.util.Optional;

public class CreateProductInteractor {
    private final LoadByIdGateway<Restaurant> restaurantGateway;
    private final CreateProductGateway createProductGateway;

    public CreateProductInteractor(LoadByIdGateway<Restaurant> restaurantGateway, CreateProductGateway createProductGateway) {
        this.restaurantGateway = restaurantGateway;
        this.createProductGateway = createProductGateway;
    }

    public Products create(Products data) throws NotFoundException {
        Optional<Restaurant> restaurant = this.restaurantGateway.loadById(data.restaurant());
        if(restaurant.isEmpty()) throw new NotFoundException("restaurante não encontrado!");
        Products product = this.createProductGateway.create(new Products(
                data.name(),
                data.price(),
                data.description(),
                data.photo(),
                data.amount(),
                data.restaurant()
        ));
        return product;
    }
}
