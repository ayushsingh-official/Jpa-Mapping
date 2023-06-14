package com.project.jpaMapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.jpaMapping.Entity.Product;
import com.project.jpaMapping.repository.ProductRepository;

public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@PostMapping("/addUser")
	public Product addProduct(@RequestBody Product product) {

		productRepository.save(product);

		return product;
	}

	@PutMapping("/updateUser/{id}")
	public Product updateProduct(@RequestBody Product product) {

		productRepository.save(product);

		return product;
	}

}
