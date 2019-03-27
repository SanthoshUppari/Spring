package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.controller.EmployeeController;
import com.hcl.controller.UserController;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });

		UserController userController = (UserController) context
				.getBean("userController");
		userController.getData();

		/*EmployeeController employeeController = (EmployeeController) context
				.getBean("employeeController");
		employeeController.getData();*/
	}
}
