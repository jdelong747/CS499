package com.sqs.training.controller;

import java.util.List;
import java.util.Map;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
			Map<String, Object> model) {
		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery("insert into EMAIL_SUB (email) values ('" + emailForm.getEmail() + "')");
		query.executeUpdate();
		SQLQuery allEmailQuery = sessionFactory.getCurrentSession().createSQLQuery("select * from EMAIL_SUB");
		allEmailQuery.addEntity(EmailSub.class);
		List<EmailSub> emailSubs = allEmailQuery.list();
		model.put("emails", emailSubs);
		return "subscribe";
	}
	
	/*
	@RequestMapping("/unsubscribe")
	public String unregisterUser(@ModelAttribute("emailForm") EmailSub emailForm) {
		return "unsubscribe";
	}
	*/
}
