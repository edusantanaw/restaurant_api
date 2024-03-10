package com.edusantanaw.restaurant.restaurant_edusantanaw.application.gateway;

import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities.Products;

public interface CreateProductGateway {
    Products create(Products data);
}
