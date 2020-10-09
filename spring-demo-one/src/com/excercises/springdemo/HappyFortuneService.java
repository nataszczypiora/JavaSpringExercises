package com.excercises.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Viel Gluck!";
	}

}
