package com.project.jpaMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.jpaMapping.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
