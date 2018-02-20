package com.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value= {"/" , "/home" , "/index" })
	public ModelAndView homePage(){
		ModelAndView mv = new ModelAndView();
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
