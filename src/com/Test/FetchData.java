package com.Test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class FetchData {
	public static void main(String[] args) {
		Configuration cf= new Configuration();
		cf.configure().addAnnotatedClass(Student.class);
		SessionFactory sf = cf.buildSessionFactory();
		Session session = sf.openSession();
		
		List<Student> list = session.createCriteria(Student.class).list();
		//List<Student> list = session.createQuery("from Student").list();
		
		
		for(Student ss :list) {
			System.out.println(ss.getId());
			System.out.println(ss.getName());
			System.out.println(ss.getMarks());
			System.out.println("*****************************");
		}
		session.close();
		System.out.println("all data Fetched");
		
		
	}

}
