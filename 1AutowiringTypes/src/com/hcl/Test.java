package com.hcl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

import com.hcl.controller.EmployeeController;
import com.hcl.controller.UserController;

public class Test {
	public static void main(String[] args) {

		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		/*UserController userController = (UserController) factory
				.getBean("userController");
		userController.getData();*/
		
		EmployeeController employeeController = (EmployeeController) factory
				.getBean("employeeController");
		employeeController.getData();
	}
}
