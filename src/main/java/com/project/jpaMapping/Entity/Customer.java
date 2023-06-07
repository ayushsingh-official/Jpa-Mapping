package com.project.jpaMapping.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 * 
 * @author ayush.singh
 * 
 **/
@Entity(name = "mst_customer")
@Table
@Data
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private String email;
	@OneToMany
	@JoinColumn(name = "CustomerId")
	private List<Order> orders = new ArrayList<>();

}
