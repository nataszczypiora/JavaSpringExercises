package com.excercises.springdemo;

public class BaseballCoach implements BasicCoach{
	
	//create a field to hold FortuneService 
	private FortuneService fortuneService;
//  constructor injection		
//	public BaseballCoach(FortuneService fortuneservice) {
//		this.fortuneService = fortuneservice;
//	}
	
	// setter injection
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout()
	{
		return "Play baseball";
	}

	@Override
	public String getDailyFortune() {
		//use fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
