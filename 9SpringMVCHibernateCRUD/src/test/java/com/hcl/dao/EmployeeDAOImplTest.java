package com.hcl.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.hcl.model.Employee;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeDAOImplTest {
	
	@Mock
	private SessionFactory sessionFactory;
	
	@Mock
	private Session session;
	
	@Mock
	private Query query;

	@InjectMocks
	private EmployeeDAOImpl employeeDAOImpl;
	
	@Test
	public void testAddEmployee() throws Exception {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("usk");
		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
		Mockito.when(session.save(employee)).thenReturn(employee);
		Employee emp = employeeDAOImpl.addEmployee2(employee);
		System.out.println(emp.getName());
		Assert.assertNotNull(emp);

	}
	
	@Test
	public void testGetAllEmployees2() throws Exception {
		
		List<Employee> emps = new ArrayList<Employee>();
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("usk");
		emps.add(employee);
		employee = new Employee();
		employee.setId(2);
		employee.setName("bng");
		emps.add(employee);
		
		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
		Mockito.when(session.createQuery("from Employee")).thenReturn(query);
		Mockito.when(query.list()).thenReturn(emps);
		
		List<Employee> employees = employeeDAOImpl.getAllEmployees2();
		
		for(Employee e : employees){
			System.out.println(e.getId()+" "+e.getName());
		}
		

	}

}
