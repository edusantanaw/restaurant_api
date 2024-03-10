package com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.controllers.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.UUID;

@Data
public class CreateProductDto {
    @NotBlank(message = "O nome é obrigatorio!")
    String name;
    @NotNull(message = "O preço é obrigatorio!")
    Double price;
    @NotBlank(message = "A descriação é obrigatoria!")
    String description;
    @NotBlank(message = "A foto é obrigatoria!")
    String photo;
    @NotNull(message = "A quantidade é obrigatoria!")
    int amount;
    @NotNull(message = "A quantidade é obrigatoria!")
    UUID restaurant;
}
