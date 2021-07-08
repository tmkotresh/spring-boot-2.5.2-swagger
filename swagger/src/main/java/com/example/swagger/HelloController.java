package com.example.swagger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class HelloController {
	
	@GetMapping("/v1/{name}")
	public String greet(@PathVariable String name) {
		return "Hello "+name;
	}

}
