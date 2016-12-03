package com.sqs.training.controller;

import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

	@RequestMapping(value = {"/home", "/"})
	public String displayHomePage(Model model, Device device) {
		if (device.isMobile()) {
			return "mobile/home";
		} else {
			return "home";
		}
	}
}
