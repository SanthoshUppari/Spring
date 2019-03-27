/*package com.ing.getflix.service;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.ing.getflix.dao.UserRepository;
import com.ing.getflix.model.User;


@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {
	@Mock
	private UserRepository userRepository;

	@InjectMocks
	private UserServiceImpl userServiceImpl;

	private static final String USER_NAME = "santhosh";

	private static User user = new User();

	@BeforeClass
	public static void setUp() {

		user.setUserId(100);
		user.setUserName("santhosh");
		user.setPassword("123456");
	}

	@Test
	public void testSaveUserDataPositive() throws Exception {
		Mockito.when(userRepository.save(user)).thenReturn(user);
		User usr = userServiceImpl.saveUserData(user);
		Assert.assertNotNull(usr);

	}

	@Test
	public void getUserByUserName() throws Exception {
		Mockito.when(userRepository.getByUserName(USER_NAME)).thenReturn(user);
		User usr = userServiceImpl.getUserByUserName(USER_NAME);
		Assert.assertNotNull(usr);
		//System.out.println(user.getUserName());
		Assert.assertEquals(usr.getUserName(), "santhosh");

	}
}*/