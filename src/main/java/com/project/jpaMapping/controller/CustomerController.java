package com.project.jpaMapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.jpaMapping.Entity.Customer;
import com.project.jpaMapping.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {

		customerService.save(customer);

		return customer;
	}

	@PutMapping("/updateCustomer/{id}")
	public Customer updateCustomer(@PathVariable int id, @RequestBody Customer customer) {

		customerService.save(customer);

		return customer;
	}

	@GetMapping("/getCustomer/{id}")
	public Customer getCustomer(@PathVariable("id") int id) {

		System.out.println("working...");

		Customer customer = customerService.getCustomer(id);

		return customer;
	}

	// testing
	@GetMapping("/")
	public String get() {

		return " JPA project ";
	}

}
