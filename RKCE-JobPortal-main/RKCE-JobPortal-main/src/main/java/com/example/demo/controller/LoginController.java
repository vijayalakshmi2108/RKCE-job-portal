package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Login;

@RestController
public class LoginController {

	public String login(@RequestBody Login login) {
		
	}
}
