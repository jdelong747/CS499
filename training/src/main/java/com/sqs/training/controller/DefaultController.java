package com.sqs.training.controller;

import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultController {

	@RequestMapping(value = {"/home", "/"})
	public String displayHomePage(Model model) {
		return "home";
	}
	
	@RequestMapping("/device")
	public @ResponseBody String detectDevice(String id, Device device) {
		String deviceType = "unknown";
		if (device.isNormal()) {
			deviceType = "normal";
		} else if (device.isMobile()) {
			deviceType = "mobile";
		} else if (device.isTablet()) {
			deviceType = "tablet";
		}
		return deviceType; 
	}
}
