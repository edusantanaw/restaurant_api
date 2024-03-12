package com.edusantanaw.restaurant.restaurant_edusantanaw.application.gateway;

import java.util.UUID;

public interface DeleteGateway<T> extends LoadByIdGateway<T> {
    void delete(T data);
}
