package com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities;

import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.exceptions.EntityValidationException;
import lombok.SneakyThrows;

import java.util.UUID;

public record Products(String name, Double price, String description, String photo, int amount, UUID restaurant) {
    @SneakyThrows
    public  Products {
        if (price <= 0) throw new EntityValidationException("O preço deve ser maior que zero!");
        if(amount < 0) throw new EntityValidationException("A quantidade deve ser maior ou igual a zero!");
    }
}
