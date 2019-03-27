package com.hcl.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView testMethod() {
		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		model.addObject("message", "Hello from testMethod");

		return model;
	}

	@RequestMapping(value = "/display1", method = RequestMethod.GET)
	public String display1(ModelMap model) {

		model.addAttribute("message", "Spring MVC Hello World");
		return "home";

	}
	
	@RequestMapping(value = "/display2", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String display2() {
		return "home";

	}
	
	@RequestMapping(value = "/display3", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public User display3() {
		User user = new User();
		user.setId(1);
		user.setName("HCL");
		return user;
	}
	
	@RequestMapping(value = "/display4", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public UserResponse display4(@RequestParam String userName) {
		
		List<User> users = new ArrayList<User>();
		System.out.println("userName====>> "+userName);
		
		User user = new User();
		user.setId(1);
		user.setName("HCL");
		users.add(user);

		user = new User();
		user.setId(2);
		user.setName(userName);
		users.add(user);
	
		UserResponse userResponse = new UserResponse();
		userResponse.setUsers(users);
		userResponse.setStatusCode("200");
		return userResponse;
	}
	
	@RequestMapping(value = "/display5/{userId}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public User display5(@PathVariable String userId) {
		System.out.println("UserId =======>> "+userId);
		User user = new User();
		user.setId(1);
		user.setName(userId);
		return user;
	}
	
	@RequestMapping(value = "/display6", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public User display6(@RequestBody User user) {
		System.out.println("UserId =======>> "+user.getName());
		return user;
	}
		
}