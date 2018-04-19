package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnityRestHit {

	@PostMapping(value = "/post/ping")
	public FormInput ping(@RequestBody FormInput user) throws Exception {
		System.out.println("Got POST call from unity!!Success");
		System.out.println(user.getUserName());
		System.out.println(user.getPwd());
		FormInput FormInput=new FormInput();
		FormInput.setUserName("POST USERNAME");
		FormInput.setPwd("POST Password");
		return FormInput;

	}

	@GetMapping(value = "/get/ping")
	public FormInput ping() throws Exception {
		System.out.println("Got GET call from unity!!Success");
		FormInput FormInput=new FormInput();
		FormInput.setUserName("GET USERNAME");
		FormInput.setPwd(" GET Password");
		return FormInput;
	}
}
