package com.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.DBConfig");
		context.refresh();
		
		SessionFactory sessionFactory = (SessionFactory)context.getBean("sessionFactory");
		Session session = sessionFactory.openSession();
		
		}
}
