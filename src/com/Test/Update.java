package com.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class Update {
	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure().addAnnotatedClass(Student.class);
		SessionFactory sf = cf.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		Student student = session.get(Student.class, 3);
		student.setMarks(200);
		student.setName("raj");
		session.update(student);
		t.commit();
		sf.close();
		System.out.println("Data Updated");
	}

}
