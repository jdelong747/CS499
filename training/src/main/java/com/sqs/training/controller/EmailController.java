package com.sqs.training.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class EmailController extends MultiActionController {

	public ModelAndView registerEmail(HttpServletRequest request,
			HttpServletResponse response) {
		return null;
	}
	
	public ModelAndView displayEmailPage(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView model = new ModelAndView("Subscribe");
		return model;
	}
	
	public ModelAndView unRegisterEmail(HttpServletRequest request,
			HttpServletResponse response) {
		return null;
	}
	
	public ModelAndView sendEmail(HttpServletRequest request,
			HttpServletResponse response) {
		return null;
	}
}
