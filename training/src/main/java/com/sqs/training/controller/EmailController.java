package com.sqs.training.controller;

import java.util.Map;

import org.hibernate.Criteria;
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
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(EmailSub.class);
//		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery("select * from EMAIL_SUB where id=1");
		EmailSub emailForm = (EmailSub) criteria.uniqueResult();
		model.put("emailForm", emailForm);
		return "subscribe";
	}
	
	@RequestMapping("/subscribeEmail")
	public String registerUser(@ModelAttribute("emailForm") EmailSub emailForm) {
		System.out.println(emailForm.getEmail());
		return "subscribe";
	}
}
