package com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.controllers;


import com.edusantanaw.restaurant.restaurant_edusantanaw.application.usecases.CreateRestaurantInteractor;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.controllers.dtos.CreateRestaurantDto;
import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities.Restaurant;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/restaurant")
public class RestaurantController {
    private final CreateRestaurantInteractor createRestaurantUsecase;
    public RestaurantController(CreateRestaurantInteractor createRestaurantUsecase) {
        this.createRestaurantUsecase = createRestaurantUsecase;
    }

    @PostMapping()
    public Restaurant create(@RequestBody() @Valid() CreateRestaurantDto data) {
        return this.createRestaurantUsecase.create(
                new Restaurant(
                        data.getName(),
                        data.getPerfilPhoto(),
                        data.getDescription(),
                        data.getCategories(),
                        true
                )
        );
    }
}
