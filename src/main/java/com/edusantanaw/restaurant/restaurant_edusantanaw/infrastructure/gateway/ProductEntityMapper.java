package com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.gateway;

import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities.Products;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.entities.ProductsEntity;

public class ProductEntityMapper {
    ProductsEntity toEntity(Products data) {
        return ProductsEntity
                .builder()
                .name(data.name())
                .photo(data.photo())
                .price(data.price())
                .description(data.description())
                .price(data.price())
                .amount(data.amount())
                .restaurant(data.restaurant())
                .build();
    }

    Products toDomain(ProductsEntity data) {
        return new Products(
                data.getName(),
                data.getPrice(),
                data.getDescription(),
                data.getPhoto(),
                data.getAmount(),
                data.getRestaurant(),
                data.getId()
        );
    }
}
