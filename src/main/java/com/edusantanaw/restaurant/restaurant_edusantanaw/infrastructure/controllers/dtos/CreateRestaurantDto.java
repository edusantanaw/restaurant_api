package com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.controllers.dtos;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data()
public class CreateRestaurantDto {
    @NotBlank(message = "o nome é obrigatorio!")
    String name;
    @NotBlank(message = "a descrição é obrigatoria!")
    String description;
    String perfilPhoto;
    String[] categories;
}
