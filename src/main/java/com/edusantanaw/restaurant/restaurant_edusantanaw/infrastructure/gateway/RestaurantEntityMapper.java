package com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.gateway;

import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities.Restaurant;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.entities.RestaurantEntity;

public class RestaurantEntityMapper {
    RestaurantEntity toEntity(Restaurant data) {
        return RestaurantEntity
                .builder()
                .name(data.name())
                .categories(String.join(",", data.categories())
                ).open(data.open() ? 1 : 0)
                .perfilPhoto(data.perfilPhoto())
                .build();
    }

    Restaurant toDomain(RestaurantEntity data) {
        return new Restaurant(
                data.getName(),
                data.getPerfilPhoto(),
                data.getDescription(),
                data.getCategories().split(","),
                data.getOpen() == 1,
                data.getId()
        );
    }
}
