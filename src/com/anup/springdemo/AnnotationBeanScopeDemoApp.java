package com.anup.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach theAlphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (theCoach == theAlphaCoach);
		
		System.out.println("result :: "+ result);
		System.out.println("Memory location of theCoach Object :: "+ theCoach);
		System.out.println("Memory location of theAlphaCoach Object :: "+theAlphaCoach);
		
		context.close();
	}

}
