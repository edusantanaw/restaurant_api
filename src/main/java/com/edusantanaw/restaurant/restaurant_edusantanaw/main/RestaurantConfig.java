package com.edusantanaw.restaurant.restaurant_edusantanaw.main;

import com.edusantanaw.restaurant.restaurant_edusantanaw.application.usecases.CreateRestaurantInteractor;
import com.edusantanaw.restaurant.restaurant_edusantanaw.application.usecases.LoadAllRestaurantInteractor;
import com.edusantanaw.restaurant.restaurant_edusantanaw.application.usecases.LoadRestaurantInteractor;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.gateway.RestaurantEntityMapper;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.gateway.RestaurantRepositoryGateway;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.persistence.RestaurantRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestaurantConfig {
    @Bean()
    CreateRestaurantInteractor createRestaurantUsecase(RestaurantRepositoryGateway restaurantGateway){
        return new CreateRestaurantInteractor(restaurantGateway);
    }

    @Bean
    RestaurantRepositoryGateway restaurantGateway(RestaurantRepository restaurantRepository, RestaurantEntityMapper restaurantEntityMapper){
        return new RestaurantRepositoryGateway(restaurantRepository, restaurantEntityMapper);
    }

    @Bean
    RestaurantEntityMapper restaurantEntityMapper(){
        return new RestaurantEntityMapper();
    }

    @Bean
    LoadRestaurantInteractor loadRestaurantInteractor(RestaurantRepositoryGateway restaurantRepositoryGateway){
        return  new LoadRestaurantInteractor(restaurantRepositoryGateway);
    }

    @Bean
    LoadAllRestaurantInteractor loadAllRestaurantInteractor(RestaurantRepositoryGateway restaurantRepositoryGateway){
        return new LoadAllRestaurantInteractor(restaurantRepositoryGateway);
    }

}
