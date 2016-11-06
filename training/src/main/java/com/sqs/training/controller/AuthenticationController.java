package com.sqs.training.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sqs.training.domain.User;

@Controller
public class AuthenticationController {

	@RequestMapping("/login")
	public String displayLoginPage(Map<String, Object> model) {
		User loginForm = new User();
		model.put("loginForm",loginForm);
		return "login";
	}
	
	@RequestMapping("/loginUser")
	public String registerUser(@ModelAttribute("loginForm") User user) {
		System.out.println(user.getUserId() + " " + user.getPassword());
		return "login";
	}
}
