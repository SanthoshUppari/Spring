/*package com.ing.getflix.controller;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.ing.getflix.model.User;
import com.ing.getflix.service.UserServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
	@InjectMocks
	private UserController userController;

	@Mock
	private UserServiceImpl userService;
	
	@Mock
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	private static final String USER_NAME = "santhosh";
	
	private static User user = new User();
	
	@BeforeClass
	public static void setUp(){		
		
		user.setUserId(100);
		user.setUserName("santhosh");
		user.setPassword("123456");
	}
	
	@Test
	public void testSaveUserData() throws Exception{		
		Mockito.when(userService.saveUserData(user)).thenReturn(user);
		Mockito.when(bCryptPasswordEncoder.encode(user.getPassword())).thenReturn("$2a$10$nMD6x7X1jDU4Y.1r0OdmtO4eSaOWGlXIaS2Ft/uGKTybzkMjLTL8S");
		ResponseEntity<User> userData = userController.saveUserData(user);
		Assert.assertNotNull(userData);
		
	}
	
	@Test
	public void testLoginPositive() throws Exception {
		Mockito.when(userService.getUserByUserName(USER_NAME)).thenReturn(user);
		Mockito.when(bCryptPasswordEncoder.matches(Mockito.anyString(),Mockito.anyString())).thenReturn(true);
		ResponseEntity<String> status = userController.login(user);
		Assert.assertNotNull(status);
	}
	
	@Test
	public void testLoginNegative() throws Exception {
		Mockito.when(userService.getUserByUserName(USER_NAME)).thenReturn(user);
		Mockito.when(bCryptPasswordEncoder.matches(Mockito.anyString(),Mockito.anyString())).thenReturn(false);
		ResponseEntity<String> status = userController.login(user);
		Assert.assertNotNull(status);
	}
	
	@Test
	public void testLoginNoUserFound() throws Exception {
		Mockito.when(userService.getUserByUserName(USER_NAME)).thenReturn(null);		
		ResponseEntity<String> status = userController.login(user);
		Assert.assertNotNull(status);
	}
	
}
*/