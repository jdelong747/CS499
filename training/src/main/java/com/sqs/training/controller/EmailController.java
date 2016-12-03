package com.sqs.training.controller;

import java.sql.Statement;
import java.util.List;
import java.util.Map;

import org.springframework.mobile.device.Device;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sqs.training.domain.EmailSub;

@Controller
@Transactional
public class EmailController {
	
	@Autowired
	SessionFactory sessionFactory;

	@RequestMapping("/subscribe")
	public String displaySubscriptionPage(Map<String, Object> model) {
		EmailSub emailForm = new EmailSub();
		model.put("emailForm", emailForm);
		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery("select * from EMAIL_SUB");
		query.addEntity(EmailSub.class);
		List<EmailSub> emailSubs = query.list();
		model.put("emails", emailSubs);
		return "subscribe";
	}
	
	@RequestMapping("/subscribeEmail")
	public String registerUser(@ModelAttribute("emailForm") EmailSub emailForm,
			Map<String, Object> model) throws Exception {
		Statement statement = sessionFactory.getCurrentSession().connection().createStatement();
		statement.executeQuery("insert into EMAIL_SUB (email) values ('" + emailForm.getEmail() + "')");
		SQLQuery allEmailQuery = sessionFactory.getCurrentSession().createSQLQuery("select * from EMAIL_SUB");
		allEmailQuery.addEntity(EmailSub.class);
		List<EmailSub> emailSubs = allEmailQuery.list();
		model.put("emails", emailSubs);
		return "subscribe";
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
	/*
	@RequestMapping("/unsubscribe")
	public String unregisterUser(@ModelAttribute("emailForm") EmailSub emailForm) {
		return "unsubscribe";
	}
	*/
}
