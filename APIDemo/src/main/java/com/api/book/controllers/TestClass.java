package com.api.book.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClass {


//	@RequestMapping("/")
	@GetMapping("/")
	public String test() {
		return "Vedant P";
	}
}
