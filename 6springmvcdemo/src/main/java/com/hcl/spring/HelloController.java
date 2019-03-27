package com.hcl.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String displayIndexPage(ModelMap model) {
		
		User user = new User();
		user.setName("Bangalore");
		model.addAttribute("user", user);

		return "index";
		
	}
	
	@RequestMapping(value="/userData", method=RequestMethod.POST)
	public String displayUserData(@ModelAttribute(value="user") User user) {
		
		System.out.println("User name "+user.getName());
		System.out.println("User name "+user.getDesg());

		return "index";
		
	}
	
	@RequestMapping(value="/test/{id}", method=RequestMethod.GET)
	public ModelAndView printHello(@RequestParam String name, @PathVariable String id) {
		System.out.println("inside controller...name  :"+name);
		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		model.addObject("message", name+" "+id);

		return model;
		
	}
	
	@RequestMapping(value="/test2", method=RequestMethod.POST)
	public ModelAndView printHello2(@RequestParam String name) {
		System.out.println("inside controller...name  :"+name);
		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		model.addObject("message", name);

		return model;
		
	}
	
	/*@RequestMapping(value="/test1", method=RequestMethod.POST)
	public ModelAndView printHello1(@ModelAttribute(value="user") User user, BindingResult result) {
		System.out.println("inside controller..."+user.getName());
		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		model.addObject("message", "Hello from testMethod");

		return model;
		
	}*/
	
}
