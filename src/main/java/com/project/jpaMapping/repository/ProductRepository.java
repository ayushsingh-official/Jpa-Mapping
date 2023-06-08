package com.project.jpaMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.jpaMapping.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
