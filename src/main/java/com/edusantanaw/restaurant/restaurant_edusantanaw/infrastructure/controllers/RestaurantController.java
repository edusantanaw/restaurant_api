package com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.controllers;


import com.edusantanaw.restaurant.restaurant_edusantanaw.application.dtos.LoadAllRequestDto;
import com.edusantanaw.restaurant.restaurant_edusantanaw.application.dtos.LoadAllResponseDto;
import com.edusantanaw.restaurant.restaurant_edusantanaw.application.exceptions.NotFoundException;
import com.edusantanaw.restaurant.restaurant_edusantanaw.application.usecases.CreateRestaurantInteractor;
import com.edusantanaw.restaurant.restaurant_edusantanaw.application.usecases.LoadAllRestaurantInteractor;
import com.edusantanaw.restaurant.restaurant_edusantanaw.application.usecases.LoadRestaurantInteractor;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.controllers.dtos.CreateRestaurantDto;
import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities.Restaurant;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController()
@RequestMapping("/api/restaurant")
public class RestaurantController {
    private final CreateRestaurantInteractor createRestaurantUsecase;
    private final LoadRestaurantInteractor loadRestaurantInteractor;
    private final LoadAllRestaurantInteractor loadAllRestaurantInteractor;

    public RestaurantController(
            CreateRestaurantInteractor createRestaurantUsecase,
            LoadRestaurantInteractor loadRestaurantInteractor,
            LoadAllRestaurantInteractor loadAllRestaurantInteractor
    ) {
        this.createRestaurantUsecase = createRestaurantUsecase;
        this.loadRestaurantInteractor = loadRestaurantInteractor;
        this.loadAllRestaurantInteractor = loadAllRestaurantInteractor;
    }

    @PostMapping()
    public ResponseEntity<Restaurant> create(@RequestBody() @Valid() CreateRestaurantDto data) {
        Restaurant restaurant = this.createRestaurantUsecase.create(
                new Restaurant(
                        data.getName(),
                        data.getPerfilPhoto(),
                        data.getDescription(),
                        data.getCategories(),
                        true,
                        null
                ));
        return ResponseEntity.status(HttpStatus.CREATED).body(restaurant);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Restaurant> loadById(@PathVariable UUID id) throws NotFoundException {
        Restaurant restaurant = this.loadRestaurantInteractor.loadById(id);
        return ResponseEntity.status(200).body(restaurant);
    }

    @GetMapping()
    public ResponseEntity loadAll(@RequestParam  String search, @RequestParam int take, @RequestParam int skip  ) {
        LoadAllResponseDto<Restaurant> restaurant = this.loadAllRestaurantInteractor.loadAll(new LoadAllRequestDto(
                take, skip, search
        ));
        return ResponseEntity.status(200).body(restaurant);
    }
}
