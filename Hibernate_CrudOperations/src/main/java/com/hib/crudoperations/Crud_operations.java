package com.hib.crudoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.entities.Employee;

public class Crud_operations {
     
	public void insert()
	{
		Configuration config=new Configuration();
		config.configure("config.xml");

		SessionFactory factory=config.buildSessionFactory();
		
		Employee emp=new Employee();
		emp.setId(2);
		emp.setName("kumar");
		emp.setCity("vadodara");
		
		System.out.println(emp);
		
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.persist(emp);
		tx.commit();
		session.close();
	}
	
	public void select(int id)
	{ 
		Configuration config=new Configuration();
		config.configure("config.xml");

		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		
		Employee emp=(Employee) session.get(Employee.class,id);
		
		System.out.println(emp);
	}
	
	public void update(int id)
	{
		Configuration config=new Configuration();
		config.configure("config.xml");

		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		
		Employee emp=(Employee) session.get(Employee.class,id);
		emp.setCity("mhbd");
		emp.setName("saisoma");
		System.out.println(emp);

		Transaction tx=session.beginTransaction();
		
		session.persist(emp);
		tx.commit();
		session.close();
	}
	
	public void delete(int id)
	{
		Configuration config=new Configuration();
		config.configure("config.xml");

		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		
		Employee emp=(Employee) session.get(Employee.class,id);
		session.remove(emp);

		Transaction tx=session.beginTransaction();
		
		session.persist(emp);
		tx.commit();
		session.close();
      
	}
	
}
