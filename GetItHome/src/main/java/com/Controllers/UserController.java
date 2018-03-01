package com.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.DAOInterface.UserDao;
import com.Model.User;

@Controller
public class UserController {
	
	@Autowired
	UserDao userDao;
	
	@RequestMapping(value="/registeruser",method=RequestMethod.POST)
	public String addUser(@ModelAttribute("user")User user,Model m) {
		
		userDao.registerUser(user);
		
		User user1 = new User();
		m.addAttribute(user1);
		
		return "index";
	}

}
