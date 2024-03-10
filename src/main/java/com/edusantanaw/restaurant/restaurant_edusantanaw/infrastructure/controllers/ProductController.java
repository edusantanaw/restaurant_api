package com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.controllers;

import com.edusantanaw.restaurant.restaurant_edusantanaw.application.exceptions.NotFoundException;
import com.edusantanaw.restaurant.restaurant_edusantanaw.application.usecases.CreateProductInteractor;
import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities.Products;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.controllers.dtos.CreateProductDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/product")
public class ProductController {

    private final CreateProductInteractor createProductInteractor;

    public ProductController(CreateProductInteractor createProductInteractor) {
        this.createProductInteractor = createProductInteractor;
    }

    @PostMapping()
    public ResponseEntity<Products> create(@RequestBody() @Valid CreateProductDto data) throws NotFoundException {
        Products products = this.createProductInteractor.create(new Products(
                data.getName(),
                data.getPrice(),
                data.getDescription(),
                data.getPhoto(),
                data.getAmount(),
                data.getRestaurant()
        ));
        return ResponseEntity.status(201).body(products);
    }
}
