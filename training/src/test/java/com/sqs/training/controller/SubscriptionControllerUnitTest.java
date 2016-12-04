package com.sqs.training.controller;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.sqs.training.domain.EmailSub;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context-test.xml")
public class EmailControllerUnitTest {
	
	private String correctReturnSubscribePage = "subscribe";
	private String emailFormModelAttribute = "emailForm";
	private String testEmail = "testemail@email.com";
	
	@Autowired
	private EmailController emailController;
	
	@Autowired
	private SessionFactory sessionFactory;

	@Test
	public void testDisplaySubscriptionPage() {
		Map<String, Object> model = new HashMap<String, Object>();
		String retValue = emailController.displaySubscriptionPage(model);
		assertThat(((EmailSub) model.get(emailFormModelAttribute)).equals(new EmailSub()), equalTo(true));
		assertThat(retValue, equalTo(correctReturnSubscribePage));
	}
	
	@Test
	@Transactional
	public void testSubscribeEmail() {
		Map<String, Object> model = new HashMap<String, Object>();
		EmailSub emailForm = new EmailSub();
		emailForm.setEmail(testEmail);
		String retValue = emailController.subscribeEmail(emailForm, model);
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(emailForm.getClass());
		Example example = Example.create(emailForm);
		criteria.add(example);
		EmailSub savedEmailSub = (EmailSub) criteria.uniqueResult();
		savedEmailSub.setId(null);
		assertThat(savedEmailSub.equals(emailForm), equalTo(true));
		assertThat(retValue, equalTo(correctReturnSubscribePage));
	}

}
