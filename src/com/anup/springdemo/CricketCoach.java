package com.anup.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("Inside the CricketCoach Constructor");
	}
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Ball 30 balls in 30 minutes!";
	}

	@Override
	public String getDailyFortune() {
		return "Today is yourlucky day you got a Bat";
	}

}
