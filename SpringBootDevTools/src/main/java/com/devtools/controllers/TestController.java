package com.devtools.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class TestController {

	@RequestMapping("/")
	@ResponseBody
	public String sum() {
		int a = 100;
		int b = 20;
		return "Sum is : " + (a+b);
	}
}

/*
Spring Boot DevTools Features
Spring Boot DevTools provides the following features:

Property Defaults
Automatic Restart
LiveReload
Remote Debug Tunneling
Remote Update and Restart

*/