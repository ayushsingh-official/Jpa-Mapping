package com.project.jpaMapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.jpaMapping.Entity.Order;
import com.project.jpaMapping.repository.OrderRepository;


@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public Order getOrder(int id) {
		
		 return orderRepository.getReferenceById(id);

	}

	public Order save(Order order) {

		return orderRepository.save(order);
		
	}

}
