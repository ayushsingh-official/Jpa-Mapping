package com.project.jpaMapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.jpaMapping.Entity.Customer;
import com.project.jpaMapping.repository.CustomerRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public void save(Customer customer) {

		customerRepository.save(customer);
		
		log.info("Customer saved");

	}

	public Customer getCustomer(int id) {

		Customer customer = customerRepository.getReferenceById(id);

		log.info("Customer Information", customer);

		return customer;
	}

}
