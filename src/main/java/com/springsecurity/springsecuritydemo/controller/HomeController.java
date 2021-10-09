package com.springsecurity.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return ("<h1>Hello</h1>");
	}
	
	@GetMapping("/user")
	public String userHome() {
		return ("<h1>Welcome User Home Page</h1>");
	}
	
	@GetMapping("/user/abc")
	public String user() {
		return ("<h1>Welcome user</h1>");
	}
	
	@GetMapping("/admin")
	public String adminHome() {
		return ("<h1>Welcome Admin Home Page</h1>");
	}
	
	@GetMapping("/admin/abc")
	public String admin() {
		return ("<h1>Welcome Admin</h1>");
	}
	

}
