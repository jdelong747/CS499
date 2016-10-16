package com.sqs.training.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class AuthenticationController extends MultiActionController {

	public ModelAndView authenticateUser(HttpServletRequest request,
			HttpServletResponse response) {
		return null;
	}
	
	public ModelAndView displayLoginPage(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView model = new ModelAndView("Login");
		return model;
	}
}
