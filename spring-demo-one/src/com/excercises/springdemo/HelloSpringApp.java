package com.excercises.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file (creating the spring container)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		BasicCoach theCoach = context.getBean("myCoach", BasicCoach.class);
		
		//calling method from bean
		System.out.println(theCoach.getDailyWorkout());
		
		//closing the context
		context.close();
	}
}
