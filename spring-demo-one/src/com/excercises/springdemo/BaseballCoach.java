package com.excercises.springdemo;

public class BaseballCoach implements BasicCoach{
	
	//create a field to hold FortuneService and constructor for BaseballCoach
	private FortuneService fortuneService;
	public BaseballCoach(FortuneService fortuneservice) {
		this.fortuneService = fortuneservice;
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
