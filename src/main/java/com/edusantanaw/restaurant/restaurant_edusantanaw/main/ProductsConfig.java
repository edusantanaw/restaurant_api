package com.edusantanaw.restaurant.restaurant_edusantanaw.main;

import com.edusantanaw.restaurant.restaurant_edusantanaw.application.usecases.CreateProductInteractor;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.gateway.ProductEntityMapper;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.gateway.ProductRepositoryGateway;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.gateway.RestaurantRepositoryGateway;
import com.edusantanaw.restaurant.restaurant_edusantanaw.infrastructure.persistence.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductsConfig {

    @Bean
    CreateProductInteractor createProductInteractor(RestaurantRepositoryGateway restaurantRepositoryGateway, ProductRepositoryGateway productRepositoryGateway){
        return new CreateProductInteractor(restaurantRepositoryGateway, productRepositoryGateway);
    }

    @Bean
    ProductRepositoryGateway productRepositoryGateway(ProductRepository productRepository, ProductEntityMapper productEntityMapper){
        return new ProductRepositoryGateway(productRepository, productEntityMapper);
    }

    @Bean
    ProductEntityMapper productEntityMapper(){
        return new ProductEntityMapper();
    }

}
