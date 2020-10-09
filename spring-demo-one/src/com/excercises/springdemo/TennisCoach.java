package com.excercises.springdemo;

public class TennisCoach implements BasicCoach{
	
	//create a field to hold FortuneService and constructor for BaseballCoach
	private FortuneService fortuneService;
	public TennisCoach(FortuneService fortuneservice) {
		this.fortuneService = fortuneservice;
	}	
	@Override
	public String getDailyWorkout() {
		return "Do something with tennis (sports aren't really my thing, sorry)";
	}

	@Override
	public String getDailyFortune() {
		//use fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
