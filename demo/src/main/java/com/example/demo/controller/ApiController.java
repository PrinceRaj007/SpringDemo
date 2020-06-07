package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello World!!";
	}
	@GetMapping("/info")
	public String getInfo() {
		return "This is Prince Raj.";
	}

}
