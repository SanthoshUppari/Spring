package com.hcl.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addEmployee(Employee employee) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(employee);
	}
	
	public Employee addEmployee2(Employee employee) {
		sessionFactory.getCurrentSession().saveOrUpdate(employee);
		return employee;

	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees2() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Employee");
		return query.list();
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees() {

		return sessionFactory.getCurrentSession().createQuery("from Employee")
				.list();
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		Employee employee = (Employee) sessionFactory.getCurrentSession().load(
				Employee.class, employeeId);
		if (null != employee) {
			this.sessionFactory.getCurrentSession().delete(employee);
		}

	}

	public Employee getEmployee(int empid) {
		return (Employee) sessionFactory.getCurrentSession().get(
				Employee.class, empid);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
		return employee;
	}

}