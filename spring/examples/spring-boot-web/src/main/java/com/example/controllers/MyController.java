package com.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/allo")
	public String getPerson() {
		return "Make JAR not WAR";
	}
	
}
