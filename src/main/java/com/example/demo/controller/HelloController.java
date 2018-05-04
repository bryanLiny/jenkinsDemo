package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String HelloWorld() {
		return "Hello World";
	}
	
	@RequestMapping(value = "/hello1", method = RequestMethod.GET)
	public String HelloWorld1() {
		return "Hello World 11111";
	}
}
