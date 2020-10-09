package com.excercises.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Exceptions.CoachDoesNotExistException;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file (creating the spring container)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from container			
		BasicCoach theCoach = context.getBean("myCoach", BasicCoach.class);		
		if(!((theCoach instanceof BaseballCoach) || (theCoach instanceof TrackCoach) || (theCoach instanceof TennisCoach))){
			context.close();
			throw new CoachDoesNotExistException(theCoach.toString());
		}
		String result = callingCoach(theCoach);
		System.out.println(result);
		//closing the context
		context.close();
	}
	public static String callingCoach(BasicCoach coach)
	{	
		//calling method from bean
		return coach.getDailyWorkout() + " " + coach.getDailyFortune();						
	}
}
