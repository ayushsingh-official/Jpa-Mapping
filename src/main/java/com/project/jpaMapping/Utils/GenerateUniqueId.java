package com.project.jpaMapping.Utils;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class GenerateUniqueId {

	// shortest way to create a unique Id
	public String generateId() {

		UUID uuid = UUID.randomUUID();
		String randomUUIDString = uuid.toString();

		return randomUUIDString.replaceAll("-", "");
	}

	public String generateOrderNumber() {
		String prefix = "ORD-";
		String datePart = new java.text.SimpleDateFormat("yyyy").format(new Date()); // Use the current year
		String randomPart = generateRandomString(6); // Generate a 6-character random part
		String orderNumber = prefix + datePart + "-" + randomPart;
		return orderNumber;
	}

	public String generateCustomerNumber() {
		String prefix = "CUST-";
		String datePart = new java.text.SimpleDateFormat("yyyy").format(new Date()); // Use the current year
		String randomPart = generateRandomString(5); // Generate a 6-character random part
		String customerNumber = prefix + datePart + "-" + randomPart;
		return customerNumber;
	}

	private String generateRandomString(int length) {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random = new Random();
		StringBuilder randomString = new StringBuilder();
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(characters.length());
			randomString.append(characters.charAt(index));
		}
		return randomString.toString();
	}

}
