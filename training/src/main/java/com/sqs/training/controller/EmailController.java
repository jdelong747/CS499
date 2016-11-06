package com.sqs.training.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sqs.training.domain.EmailSub;

@Controller
public class EmailController {

	@RequestMapping("/subscribe")
	public String displaySubscriptionPage(Map<String, Object> model) {
		EmailSub emailForm = new EmailSub();
		model.put("emailForm", emailForm);
		return "subscribe";
	}
	
	@RequestMapping("/subscribeEmail")
	public String registerUser(@ModelAttribute("emailForm") EmailSub emailForm) {
		System.out.println(emailForm.getEmail());
		return "subscribe";
	}
}
