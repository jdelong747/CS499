package com.sqs.training.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

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
	public String registerUser(@ModelAttribute("loginForm") User user, Map<String, Object> model,
			HttpSession session) {
		if ("test".equals(user.getUserId()) && "pass".equals(user.getPassword())) {
			model.put("message", "Greetings ");
			session.setAttribute("user", user);
		} else {
			model.put("message", "Incorrect credentials");
		}
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logoutUser(Map<String, Object> model,
			HttpSession session) {
		session.removeAttribute("user");
		User loginForm = new User();
		model.put("loginForm",loginForm);
		return "login";
	}
}
