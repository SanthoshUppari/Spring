package com.hcl.hibernatedemo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppCls {
	
	public static void main(String atgs[]) {
		
		SessionFactory factory = new Configuration().configure("hibernate-cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		
		Employee1 employee1 = new Employee1();
		employee1.setName("BNG");
		
		Address address = new Address();
		address.setLocation("BNG");
		employee1.setAddress(address);
		
		
		session.save(employee1);
		
		Query query = session.createQuery("from Employee1");
		List<Employee1> employee1s = query.list();
		
		for(Employee1 e : employee1s) {
			System.out.println(e.getId()+" "+e.getName());
		}
		
		t.commit();
		
		session.close();
		System.out.println("Success...");
		
		
	}

}
