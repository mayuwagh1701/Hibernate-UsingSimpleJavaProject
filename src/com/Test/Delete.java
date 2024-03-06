package com.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class Delete {
	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure();
		cf.addAnnotatedClass(Student.class);
		SessionFactory sf = cf.buildSessionFactory();
		Session session = sf.openSession();
		
		
		
		Transaction t = session.beginTransaction();
		Student student = session.get(Student.class, 4);
		session.delete(student);
		t.commit();
		sf.close();
		System.out.println("Data Deleted");
	}

}
