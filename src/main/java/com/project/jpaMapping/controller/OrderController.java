package com.project.jpaMapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.jpaMapping.Dto.OrderDto;
import com.project.jpaMapping.Entity.Order;
import com.project.jpaMapping.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/getOrder/{id}")
	public ResponseEntity<?> getOrder(@PathVariable int id) {

		OrderDto dto = orderService.getOrder(id);

		return new ResponseEntity<>(dto, HttpStatus.OK);
	}

	@PostMapping("/addOrder")
	public Order addOrder(@RequestBody Order order) {

		Order orderObj = orderService.save(order);

		return orderObj;
	}

}
