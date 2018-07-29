package com.anup.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("TennisCoach ::: in the doMyStartUpStuff() method");
	}

	@PreDestroy
	public void doMyCleanUpStuff() {	
		System.out.println("TennisCoach ::: in the doMyCleanUpStuff() method");
	}
	
	@Override
	public String getDailyWorkout() {
		return "practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
