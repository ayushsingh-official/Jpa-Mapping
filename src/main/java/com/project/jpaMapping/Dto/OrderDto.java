package com.project.jpaMapping.Dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

	private int id;
	private String orderNumber;
	private String address;
	private int totalAmount;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date orderDate;

}
