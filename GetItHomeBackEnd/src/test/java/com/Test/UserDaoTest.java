package com.Test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.DAOInterface.UserDao;
import com.Model.User;

public class UserDaoTest {

	static UserDao userDao;
	
	@BeforeClass
	public static void preExecution() {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		userDao = (UserDao)context.getBean("userDao");
	}
	
	@Ignore
	@Test
	public void registerUser() {
		
		User user = new User();
		user.setUserName("Rajveer");
		user.setPassword("123456");
		user.setCustomerName("Rajveer lakkoju");
		user.setRole("user");
		user.setEmailId("rajveer@gmail.com");
		user.setAddress("samata nagar, gajuwaka");
		
		assertTrue("Problem in registering a new user",userDao.registerUser(user));
		
	}
	
	@Ignore
	@Test
	public void updateUser() {
		
		User user = userDao.getUser("10");
		user.setCustomerName("Ashish");
		
		assertTrue("Problem in updating the user",userDao.updateUser(user));
	}

}
