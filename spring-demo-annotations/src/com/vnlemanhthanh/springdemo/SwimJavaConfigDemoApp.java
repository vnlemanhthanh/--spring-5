package com.vnlemanhthanh.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The type Java config demo app.
 */
public class SwimJavaConfigDemoApp {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);

		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		System.out.println(theCoach.teamInfo());

		context.close();
	}
}











