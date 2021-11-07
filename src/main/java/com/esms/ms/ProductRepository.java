package com.esms.ms;

import org.springframework.stereotype.Repository;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;

import reactor.core.publisher.Flux;

@Repository
public interface ProductRepository extends ReactiveCosmosRepository<Product, String>{
	Flux<Product> findByProductName(String productName);
}
