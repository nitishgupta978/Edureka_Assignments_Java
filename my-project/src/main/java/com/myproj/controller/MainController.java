package com.myproj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("myproj")
public class MainController {

	@GetMapping("/")
	public String test() {
		return "running";
	}
}
