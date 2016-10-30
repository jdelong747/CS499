package com.sqs.training.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sqs.training.domain.User;

@Controller
public class RegisterController {

	@RequestMapping("/register")
	public String displayRegisterPage(Map<String, Object> model) {
		User registrationForm = new User();
		model.put("registrationForm",registrationForm);
		return "register";
	}
	
	@RequestMapping("/registerUser")
	public String registerUser(@ModelAttribute("registrationForm") User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName());
		return "register";
	}
} 
