package com.huyvu.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HelloApiController {
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/welcome")
	public String wellcome() {
		return "nguoi theo huong hoa may mu giang loi";
	}
}
