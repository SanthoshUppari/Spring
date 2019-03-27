package com.hcl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.hcl.controller.UserController;

public class Test {
	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));

		UserController userController = (UserController) factory
				.getBean("userController");
		userController.getData();

	}
}
