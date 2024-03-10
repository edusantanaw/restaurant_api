package com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.gateway;

import com.edusantanaw.restaurant.restaurant_edusantanaw.application.gateway.CreateProductGateway;
import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities.Products;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.entities.ProductsEntity;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.persistence.ProductRepository;

public class ProductRepositoryGateway implements CreateProductGateway {
    private final ProductRepository productRepository;
    private final ProductEntityMapper productEntityMapper;

    public ProductRepositoryGateway(ProductRepository productRepository, ProductEntityMapper productEntityMapper) {
        this.productRepository = productRepository;
        this.productEntityMapper = productEntityMapper;
    }

    @Override
    public Products create(Products data) {
        ProductsEntity productsEntity = this.productEntityMapper.toEntity(data);
        this.productRepository.save(productsEntity);
        return this.productEntityMapper.toDomain(productsEntity);
    }
}
