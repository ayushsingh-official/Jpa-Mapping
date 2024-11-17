package com.project.jpaMapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.jpaMapping.Dto.CustomerDto;
import com.project.jpaMapping.Entity.Customer;
import com.project.jpaMapping.service.CustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/addCustomer")
	public Customer addCustomer(@Valid @RequestBody Customer customer) {

		customerService.save(customer);

		return customer;
	}

	@PutMapping("/updateCustomer/{id}")
	public Customer updateCustomer(@RequestBody Customer customer) {

		customerService.save(customer);

		return customer;
	}

	/*
	 * @
	 */
	@GetMapping("/getCustomer")
	public ResponseEntity<CustomerDto> getCustomer(@RequestParam(required = false) Integer id) {

		Customer customer = customerService.getCustomer(id);

		CustomerDto dto = new CustomerDto(customer.getId(), customer.getName(), customer.getAge(), customer.getEmail());

		return new ResponseEntity<CustomerDto>(dto, HttpStatus.OK);

	}

}
