package com.vnlemanhthanh.hibernate.demo;

import com.vnlemanhthanh.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {
	public static void main(String[] args) {
		//createAndSaveStudent();

		int theStudentId = 3;
		readStudent(theStudentId);

	}

	public static void createAndSaveStudent() {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			Student tempStudent1 = new Student("Thanh1", "LE1", "thanh1@gmail.com");
			Student tempStudent2 = new Student("Thanh2", "LE2", "thanh2@gmail.com");
			Student tempStudent3 = new Student("Thanh3", "LE3", "thanh3@gmail.com");

			session.beginTransaction();

			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);

			session.getTransaction().commit();
			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

	public static Student readStudent(int theStudentId) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		try {
			Session session = factory.getCurrentSession();
			session.beginTransaction();

			Student theStudent = session.get(Student.class, theStudentId);
			session.getTransaction().commit();
			System.out.println(theStudent+ "\nDone!");

			return theStudent;
		} finally {
			factory.close();
		}
	}
}
