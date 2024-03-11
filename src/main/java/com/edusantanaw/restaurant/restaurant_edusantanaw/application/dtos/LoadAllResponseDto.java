package com.edusantanaw.restaurant.restaurant_edusantanaw.application.dtos;

import java.util.List;

public record LoadAllResponseDto<T>(List<T> data, Long total) {
}
