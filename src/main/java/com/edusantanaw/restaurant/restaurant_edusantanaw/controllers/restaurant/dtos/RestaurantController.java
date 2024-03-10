package com.edusantanaw.restaurant.restaurant_edusantanaw.controllers.restaurant.dtos;

import com.edusantanaw.restaurant.restaurant_edusantanaw.controllers.restaurant.dtos.CreateRestaurantDto;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infra.entities.Restaurant;
import com.edusantanaw.restaurant.restaurant_edusantanaw.services.RestaurantService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/restaurant")
@AllArgsConstructor()
public class RestaurantController {
    @Autowired()
    private final RestaurantService restaurantService;

    @PostMapping()
    public Restaurant create(@Valid()CreateRestaurantDto data){
        Restaurant restaurant = this.restaurantService.create(data);
        return restaurant;
    }
}
