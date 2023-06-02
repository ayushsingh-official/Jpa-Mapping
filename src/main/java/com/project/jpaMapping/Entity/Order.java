package com.project.jpaMapping.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "mst_order")
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String orderNumber;
	private String address;
	private int totalAmount;
	@OneToMany
	@JoinColumn(name = "product_class_id")
	private List<Product> productId;

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getOrderNumber() {
//		return orderNumber;
//	}
//
//	public void setOrderNumber(String orderNumber) {
//		this.orderNumber = orderNumber;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public int getTotalAmount() {
//		return totalAmount;
//	}
//
//	public void setTotalAmount(int totalAmount) {
//		this.totalAmount = totalAmount;
//	}
//
//	public List<Product> getProducts() {
//		return products;
//	}
//
//	public void setProducts(List<Product> products) {
//		this.products = products;
//	}

}
