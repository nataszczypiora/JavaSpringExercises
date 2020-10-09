package com.excercises.springdemo;

public class BaseballCoach implements BasicCoach{
	
	@Override
	public String getDailyWorkout()
	{
		return "Play baseball";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}
}
