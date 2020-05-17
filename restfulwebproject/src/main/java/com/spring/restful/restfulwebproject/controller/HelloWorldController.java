package com.spring.restful.restfulwebproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "Hello world!";
	}
}
