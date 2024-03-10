package com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities;

import java.util.UUID;

public record Restaurant(String name, String perfilPhoto, String description, String[] categories, boolean open, UUID id) { }
