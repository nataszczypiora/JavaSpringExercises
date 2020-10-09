package com.excercises.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Exceptions.CoachDoesNotExistException;

public class HelloSpringApp {

	public static void main(String[] args) {
		String typeOfCoach = ("BaseballCoach");
		System.out.println(callingCoach(typeOfCoach));
	}
	
	
	public static String callingCoach(String typeOfCoach)
	{
		//load the spring configuration file (creating the spring container)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		if (typeOfCoach != "BaseballCoach" && typeOfCoach != "TrackCoach" && typeOfCoach != "TennisCoach")
		{
			context.close();
			throw new CoachDoesNotExistException(typeOfCoach);
		}
		
		//retrieve bean from container			
		BasicCoach theCoach = context.getBean(typeOfCoach, BasicCoach.class);		
		
		//closing the context
		context.close();
			
		//calling method from bean
		return theCoach.getDailyWorkout();						
	}
}
