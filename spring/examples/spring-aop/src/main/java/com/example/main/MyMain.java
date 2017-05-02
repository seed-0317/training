package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.service.EventService;

public class MyMain {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		EventService eventService = (EventService) applicationContext.getBean("awesomeBean");
		
		eventService.playComedyShow();
		System.out.println();
		eventService.playConcert();
		System.out.println();
		eventService.runAmusementPark();
		
	}
}
