package com.sqs.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

	@RequestMapping(value = {"/home", "/"})
	public String displayHomePage(Model model) {
		return "home";
	}
}
