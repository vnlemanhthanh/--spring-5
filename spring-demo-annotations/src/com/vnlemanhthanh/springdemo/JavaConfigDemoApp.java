package com.vnlemanhthanh.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The type Java config demo app.
 */
public class JavaConfigDemoApp {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);

		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		context.close();
	}
}











