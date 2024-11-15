package com.project.jpaMapping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UIController {

	@GetMapping()
	public String getUI() {

		return "UI working......";

	}

}
