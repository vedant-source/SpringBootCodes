package com.springboot.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String mainHandler() {
		System.out.println("mainHandler worked ... !!!");
		return "home";
	}
	
	@RequestMapping("/contact")
	public String contactHandler() {
		System.out.println("contactHandler worked ... !!!");
		return "contact";
	}
}
