package com.edusantanaw.restaurant.restaurant_edusantanaw.application.gateway;

import com.edusantanaw.restaurant.restaurant_edusantanaw.application.dtos.LoadAllResponseDto;

public interface LoadAllGateway <In, Out>{
    LoadAllResponseDto<Out> loadAll(In data);
}
