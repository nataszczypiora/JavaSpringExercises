package com.excercises.springdemo;

public class CricketCoach implements BasicCoach{
	
	//create a field to hold FortuneService
	private FortuneService fortuneService;
	private String email;
	private String team;
//  constructor injection	
//	public TennisCoach(FortuneService fortuneservice) {
//		this.fortuneService = fortuneservice;
//	}	
	
	// setter injections
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Do something with cricket (sports aren't really my thing, sorry)";
	}

	@Override
	public String getDailyFortune() {
		//use fortuneService to get a fortune
		return fortuneService.getFortune() + 
				"\nemail: " + email + "\nteam: " + team;
	}
}
