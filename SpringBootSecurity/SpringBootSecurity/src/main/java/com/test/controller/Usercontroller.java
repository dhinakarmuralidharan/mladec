package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {
	@GetMapping("/")
	public String testYmlFailConfig()
	{
		return "This is simple Rest Api response";
	}

}
