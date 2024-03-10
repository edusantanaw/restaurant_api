package com.edusantanaw.restaurant.restaurant_edusantanaw.application.gateway;

import java.util.Optional;
import java.util.UUID;

public interface LoadByIdGateway <T>{
    Optional<T> loadById(UUID id);
}
