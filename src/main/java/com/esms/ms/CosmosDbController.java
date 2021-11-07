package com.esms.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/products")
public class CosmosDbController {

	@Autowired
	private ProductRepository productRepository;

	@GetMapping("/")
	public Flux<Product> getProducts() {

		return productRepository.findAll();
	}

}
