package com.excercises.springdemo;

public class TrackCoach implements BasicCoach {

	//create a field to hold FortuneService and constructor for BaseballCoach
	private FortuneService fortuneService;
	public TrackCoach(FortuneService fortuneservice) {
		this.fortuneService = fortuneservice;
	}	
	@Override
	public String getDailyWorkout() {
		return "Do a running";
	}

	@Override
	public String getDailyFortune() {
		//use fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
