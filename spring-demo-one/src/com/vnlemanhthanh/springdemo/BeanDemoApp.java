package com.vnlemanhthanh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDemoApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		boolean result = (theCoach == alphaCoach);

		System.out.println("\nPointing to the same object: " + result);

		System.out.println("theCoach " + theCoach);
		System.out.println("alphaCoach " + alphaCoach);

		System.out.println(theCoach.getDailyWorkout());

		context.close();
	}
}
