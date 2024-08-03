package com.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ShoppingController {
	
	@GetMapping("/greet")
	public String welcome() {
		return "Hello user! welcome to our app for shopping";
	}

}
