package com.demo.myapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MyController {

	@RequestMapping("api/health")
	public String sayHello() {
		return "API Health: Good";
	}
	
	@RequestMapping("api/ping")
	public String sayPing() {
		return "Server Response";
	}
	
	@RequestMapping("api/user")
	public String loginUser() {
		return "Successful Login";
	}
}
