package com.Test;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class Test {

	public static void main(String[] args) {

		Configuration cf = new Configuration();
		cf.configure();
		cf.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cf.buildSessionFactory();

		Session session = sf.openSession();
		
		
		
		
		
		Transaction t = session.beginTransaction();
		
		Student s1 = new Student(1, "mayur", 24);
		Student s2 = new Student(2, "ravi", 23);
		Student s3 = new Student(3, "akshay", 25);
		Student s4 = new Student(4, "raj", 26);
		Student s5 = new Student(5, "vishal", 20);

		ArrayList<Student> ss = new ArrayList<>();
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		ss.add(s4);
		ss.add(s5);

		for (Student student : ss) {
			student.getId();
			student.getName();
			student.getMarks();
			session.save(student);

			
		}

		t.commit();
		sf.close();

	}

}
