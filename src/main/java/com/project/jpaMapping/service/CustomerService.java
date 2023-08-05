package com.project.jpaMapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.jpaMapping.Entity.Customer;
import com.project.jpaMapping.repository.CustomerRepository;

@Service
public class CustomerService {

	// CRUD

	@Autowired
	private CustomerRepository customerRepository;

	
	public void save(Customer customer) {

		customerRepository.save(customer);

	}

	public Customer getCustomer(int id) {
		
		Customer customer = customerRepository.getReferenceById(id);
		
		return customer;
	}
	
}
