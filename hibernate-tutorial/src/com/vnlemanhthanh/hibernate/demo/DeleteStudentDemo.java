package com.vnlemanhthanh.hibernate.demo;

import com.vnlemanhthanh.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class DeleteStudentDemo {
	public static void main(String[] args) {
		createAndSaveStudent();

		int theStudentId = (int) (10 * Math.random());
		//readStudent(theStudentId);

		//queryStudents();

		//updateStudent();

		deleteStudent();

	}

	private static void deleteStudent() {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {

			session = factory.getCurrentSession();
			session.beginTransaction();

			int studentId = 1;
			Student student = session.get(Student.class, studentId );
			session.delete(student);

			//delete student id=2
			session.createQuery("delete from Student where id=2").executeUpdate();

			session.getTransaction().commit();
			System.out.println(studentId + " Done!");
		} finally {
			factory.close();
		}
	}

	private static void updateStudent() {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			int studentId = (int) (10 * Math.random());
			session = factory.getCurrentSession();
			session.beginTransaction();

			Student student = session.get(Student.class, studentId );
			student.setLastName("Scooby");

			session.getTransaction().commit();

			// update email for all student
			session = factory.getCurrentSession();
			session.beginTransaction();

			session.createQuery("update Student set email='foo@gmail.com'").executeUpdate();

			session.getTransaction().commit();
			System.out.println("Done!");
		} finally {
			factory.close();
		}
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
