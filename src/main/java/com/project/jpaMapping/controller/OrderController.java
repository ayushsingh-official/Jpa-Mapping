package com.project.jpaMapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.jpaMapping.Entity.Order;
import com.project.jpaMapping.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/getOrder/{id}")
	public Order getOrder(@PathVariable int id) {

		Order order = orderService.getOrder(id);

		return order;
	}

	@PostMapping("/addOrder")
	public Order addCustomer(@RequestBody Order order) {

		Order orderObj = orderService.save(order);

		return orderObj;
	}

}
