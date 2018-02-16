package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping(value= {"/" , "/home", "/index"})
	public ModelAndView homepage() {
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
		return mv;
	}
	
	@RequestMapping(value= "/about")
	public ModelAndView about() {
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	
	@RequestMapping(value= "/contact")
	public ModelAndView contact() {
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	@RequestMapping(value="signup")
	public ModelAndView signUpPage() {
		return new ModelAndView("signup");
	}
}
