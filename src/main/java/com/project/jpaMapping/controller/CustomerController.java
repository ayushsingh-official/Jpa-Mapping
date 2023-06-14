package com.project.jpaMapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.jpaMapping.Entity.Customer;
import com.project.jpaMapping.repository.CustomerRepository;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	@PostMapping("/addUser")
	public Customer addCustomer(@RequestBody Customer customer) {

		customerRepository.save(customer);

		return customer;
	}

	@PutMapping("/updateUser/{id}")
	public Customer updateCustomer(@RequestBody Customer customer) {

		customerRepository.save(customer);

		return customer;
	}

}
