package com.project.jpaMapping.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class CustomerDto {

	private int id;

	private String name;
	private int age;
	private String email;

}
