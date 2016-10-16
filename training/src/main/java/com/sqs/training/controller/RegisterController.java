package com.sqs.training.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class RegisterController extends MultiActionController {

	public ModelAndView registerUser(HttpServletRequest request,
			HttpServletResponse response) {
		return null;
	}
	
	public ModelAndView displayRegisterPage(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView model = new ModelAndView("Register");
		return model;
	}
} 
