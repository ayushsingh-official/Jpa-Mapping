package com.project.jpaMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.jpaMapping.Entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
