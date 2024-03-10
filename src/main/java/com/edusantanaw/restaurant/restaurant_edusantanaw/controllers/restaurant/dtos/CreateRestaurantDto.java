package com.edusantanaw.restaurant.restaurant_edusantanaw.controllers.restaurant.dtos;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data()
public class CreateRestaurantDto {
    @NotBlank(message = "o nome é obrigatorio!")
    String name;
    @NotBlank(message = "a descrição é obrigatoria!")
    String description;
    String perfilPhoto;
    @Length(min = 1, message = "deve ter pelo menos 1 categoria!")
    String[] categories;
}
