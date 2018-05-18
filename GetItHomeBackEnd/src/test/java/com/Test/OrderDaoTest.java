package com.Test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.DAOInterface.OrderDao;
import com.Model.Order;

public class OrderDaoTest {

static OrderDao orderDao;
	
	@BeforeClass
	public static void preExecution() {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		orderDao = (OrderDao)context.getBean("orderDao");
		
	}
	
	@Test
	public void processPayment() {
		Order order = new Order();
		
		order.setPaymentMode("CC");
		order.setUsername("kiran");
		order.setTotalAmountPaid(52000);
		order.setOrderDate(new java.util.Date());
		
		assertTrue("problem in adding order",orderDao.paymentProcess(order));
	}
	
}
