package com.project.jpaMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.jpaMapping.Entity.Customer;
import com.project.jpaMapping.Entity.Product;
import com.project.jpaMapping.repository.ProductRepository;

@SpringBootApplication
public class JpaMappingApplication implements CommandLineRunner {

	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Customer customer1 = new Customer();

		Product product1 = new Product();
		product1.setName("Shampoo");
		product1.setCategory("FMCG");
		product1.setPrice("200");

		Product product2 = new Product();
		product2.setName("Dish Wash");
		product2.setCategory("FMCG");
		product2.setPrice("70");

		Product prodObj = productRepository.save(product1);

//		Order order1 = new Order();
//		order1.setOrderNumber("001");
//		order1.setAddress("Kormangala , Bangalore");
//		order1.setTotalAmount(270);
//		order1.setP

	}

}
