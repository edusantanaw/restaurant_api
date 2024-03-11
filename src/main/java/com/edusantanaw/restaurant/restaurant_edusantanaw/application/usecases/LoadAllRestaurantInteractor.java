package com.edusantanaw.restaurant.restaurant_edusantanaw.application.usecases;

import com.edusantanaw.restaurant.restaurant_edusantanaw.application.dtos.LoadAllRequestDto;
import com.edusantanaw.restaurant.restaurant_edusantanaw.application.dtos.LoadAllResponseDto;
import com.edusantanaw.restaurant.restaurant_edusantanaw.application.gateway.LoadAllGateway;
import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities.Restaurant;

public class LoadAllRestaurantInteractor {
    private final LoadAllGateway<LoadAllRequestDto, Restaurant> restaurantRepository;
    public LoadAllRestaurantInteractor(LoadAllGateway<LoadAllRequestDto, Restaurant> restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }
    public LoadAllResponseDto<Restaurant> loadAll(LoadAllRequestDto data){
        return this.restaurantRepository.loadAll(
                new LoadAllRequestDto(
                        Math.min(data.take(), 100),
                        Math.max(data.skip(), 0),
                        data.search()
                )
        );
    }
}
