package com.vnlemanhthanh.hibernate.demo;

import com.vnlemanhthanh.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDemo {
	public static void main(String[] args) {
		createAndSaveStudent();

		int theStudentId = (int) (10 * Math.random());
		//readStudent(theStudentId);

		queryStudents();

	}

	private static void queryStudents() {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();

			List<Student> theStudents = session.createQuery("from Student").getResultList();
			for (Student student : theStudents) {
				System.out.println(student);
			}

			theStudents =session.createQuery(
					"from Student s where s.lastName='LE1'").getResultList();
			for (Student student : theStudents) {
				System.out.println(student);
			}

			theStudents =session.createQuery(
					"from Student s where s.lastName='LE1' OR firstName='Thanh2'").getResultList();
			for (Student student : theStudents) {
				System.out.println(student);
			}

			session.getTransaction().commit();
			System.out.println("\nDone!");

		} finally {
			factory.close();
		}
	}

	private static void createAndSaveStudent() {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			int nums = (int) (10 * Math.random());
			Student[] students = new Student[nums];
			for (int i = 0; i < nums; i++) {
				students[i] = new Student("Thanh" + i, "LE" + i, i + "thanh@gmail.com");
			}

			session.beginTransaction();

			for (int i = 0; i < nums; i++) {
				session.save(students[i]);
			}

			session.getTransaction().commit();
			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

	private static Student readStudent(int theStudentId) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
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
