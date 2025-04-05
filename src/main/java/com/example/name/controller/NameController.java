package com.example.name.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/name")
public class NameController {
	
	@GetMapping(value = "/getname")
	public String getName() {
		return "Name from Name Micro-Service";
	}
	
	@PostMapping(value = "/getname")
	public String getNameForPost(@RequestBody String request) {
		System.out.println("Request = "+ request);
		return "Name from Name Service";
	}
	

}
