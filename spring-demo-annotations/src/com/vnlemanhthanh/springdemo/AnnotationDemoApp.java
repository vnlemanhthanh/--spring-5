package com.vnlemanhthanh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The type Annotation demo app.
 */
public class AnnotationDemoApp {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());

		context.close();
	}
}
