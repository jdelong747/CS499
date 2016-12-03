package com.sqs.training.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mobile.device.Device;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sqs.training.domain.User;

@Controller
public class AuthenticationController {
	
	@Autowired
	private AuthenticationManager authenticationManager;

	@RequestMapping("/login")
	public String displayLoginPage(Map<String, Object> model, Device device) {
		User loginForm = new User();
		model.put("loginForm",loginForm);
		if (device.isMobile()) {
			return "mobile/login";
		} else {
			return "login";
		}
	}
	
	@RequestMapping("/loginUser")
	public String registerUser(@ModelAttribute("loginForm") User user, Map<String, Object> model,
			HttpSession session, Device device) {
		Authentication authentication = new UsernamePasswordAuthenticationToken(user.getUserId(), user.getPassword());
		Authentication checkAuth = authenticationManager.authenticate(authentication);
		if (checkAuth.isAuthenticated()) {
			session.setAttribute("user", user);
		} else {
			model.put("errorMessage", "Incorrect credentials");
			if (device.isMobile()) {
				return "mobile/login";
			} else {
				return "login";
			}
		}
		if (device.isMobile()) {
			return "mobile/home";
		} else {
			return "home";
		}
	}
	
	@RequestMapping("/logout")
	public String logoutUser(Map<String, Object> model,
			HttpSession session, Device device) {
		session.removeAttribute("user");
		if (device.isMobile()) {
			return "mobile/home";
		} else {
			return "home";
		}
	}
}
