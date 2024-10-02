package com.hib.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.crudoperations.Crud_operations;
import com.hib.entities.Employee;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		   Configuration cfg=new Configuration();
//	        cfg.configure("config.xml");
//	        SessionFactory factory=cfg.buildSessionFactory();
//            //Session s=factory.openSession();
//            
//            Employee emp=new Employee();
//            emp.setId(1);
//            emp.setName("soma");
//            emp.setCity("ahmd");
//            
//            System.out.println(emp);
//	         
//            Session s=factory.openSession();
//	        Transaction tx=s.beginTransaction();
//	
//	         s.persist(emp);
//	         tx.commit();
//	         s.close();
//
//          s.close();
		
		Crud_operations c=new Crud_operations();
		//c.insert();
		//c.select(2);
		//c.update(1);
		c.delete(2);
		
	}

}
