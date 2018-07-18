package com.anup.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
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
