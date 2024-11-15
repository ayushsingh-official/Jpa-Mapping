package com.project.jpaMapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.jpaMapping.Dto.CustomerDto;
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

	@GetMapping("/getCustomer")
	public ResponseEntity<CustomerDto> getCustomer(@RequestParam int id) {

		Customer customer = customerService.getCustomer(id);

		CustomerDto dto = new CustomerDto(customer.getId(), customer.getName(), customer.getAge(), customer.getEmail());

		return new ResponseEntity<CustomerDto>(dto, HttpStatus.OK);

	}

	// testing
	@GetMapping("/")
	public String get() {

		return " JPA project ";
	}

}
