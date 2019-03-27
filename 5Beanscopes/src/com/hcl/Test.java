package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.service.DepartmentService;
import com.hcl.service.UserService;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });

		/*UserService userService1 = (UserService) context.getBean("userService");
		System.out.println("userService1 ==>>" + userService1);
		userService1.setName("HCL");

		UserService userService2 = (UserService) context.getBean("userService");
		System.out.println("userService2 ==>>" + userService2);
		System.out.println("Name ... " + userService2.getName());*/

		DepartmentService departmentService1 = (DepartmentService) context
				.getBean("departmentService");
		System.out.println("departmentService1 ==>>" + departmentService1);
		departmentService1.setName("Bangalore");

		DepartmentService departmentService2 = (DepartmentService) context
				.getBean("departmentService");
		System.out.println("departmentService2 ==>>" + departmentService2);
		System.out.println("Name ... " + departmentService2.getName());
	}
}
