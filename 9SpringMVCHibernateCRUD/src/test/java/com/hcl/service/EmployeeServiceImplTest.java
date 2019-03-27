package com.hcl.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.hcl.dao.EmployeeDAO;
import com.hcl.model.Employee;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceImplTest {
	
	@Mock
	private EmployeeDAO employeeDAO;

	@InjectMocks
	private EmployeeServiceImpl employeeServiceImpl;
	
	@Test
	public void testAddEmployee() throws Exception {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("usk");
		Mockito.when(employeeDAO.addEmployee2(employee)).thenReturn(employee);
		Employee emp = employeeServiceImpl.addEmployee2(employee);
		System.out.println(emp.getName());
		Assert.assertNotNull(emp);

	}

}
