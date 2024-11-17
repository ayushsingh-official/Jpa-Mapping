package com.project.jpaMapping.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.jpaMapping.Dto.OrderDto;
import com.project.jpaMapping.Entity.Order;
import com.project.jpaMapping.Utils.GenerateUniqueId;
import com.project.jpaMapping.repository.OrderRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private GenerateUniqueId generateOrderId;

	public OrderDto getOrder(int id) {

		Order order = orderRepository.getReferenceById(id);

		Date date = order.getOrderDate();

		OrderDto orderDto = new OrderDto(order.getId(), order.getOrderNumber(), order.getOrderNumber(),
				order.getTotalAmount(), date);

		log.info("Order....", orderDto);

		return orderDto;

	}

	public Order save(Order order) {

		String orderNo = generateOrderId.generateOrderNumber();
		order.setOrderNumber(orderNo);
		
		return orderRepository.save(order);

	}

}
