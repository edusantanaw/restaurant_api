package com.edusantanaw.restaurant.restaurant_edusantanaw.infra.gateway;

import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities.RestaurantEntity;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infra.entities.Restaurant;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infra.repositories.RestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service()
@AllArgsConstructor()
public class RestaurantGateway {
    @Autowired()
    private final RestaurantRepository restaurantRepository;

    public Restaurant create(RestaurantEntity data) {
        Restaurant restaurant =
                Restaurant
                        .builder()
                        .name(data.get_name())
                        .categories(Arrays.toString(data.get_categories()))
                        .open(data.is_open() ? 1 : 0)
                        .perfilPhoto(data.get_perfilPhoto())
                        .build();
        this.restaurantRepository.save(restaurant);
        return restaurant;
    }

}
