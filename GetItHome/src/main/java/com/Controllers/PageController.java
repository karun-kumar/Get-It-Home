package com.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.DAOInterface.CategoryDao;

@Controller
public class PageController {
	
	@Autowired
	CategoryDao categoryDao;
	
	@RequestMapping(value= {"/" , "/home" , "/index" })
	public ModelAndView homePage(){
		ModelAndView mv = new ModelAndView();
		
		/*adding the list of categories*/
		mv.addObject("categories",categoryDao.listCategories());
		
		mv.setViewName("index");
		return mv;
	}	
	
	@RequestMapping(value="/about")
	public String val2() {
	return "About";	
	}
	
	@RequestMapping(value="/contact")
	public String val3() {
	return "Contact";	
	}

}
