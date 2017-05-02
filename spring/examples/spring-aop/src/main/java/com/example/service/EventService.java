package com.example.service;

import org.springframework.stereotype.Component;

@Component(value="awesomeBean")
public class EventService {
	
	public void playComedyShow(){
		System.out.println("---------------------");
		System.out.println("Comedy Show plays");
		System.out.println("---------------------");
	}
	
	public void playConcert(){
		System.out.println("---------------------");
		System.out.println("Concert plays");
		System.out.println("---------------------");
	}
	
	public void runAmusementPark(){
		System.out.println("---------------------");
		System.out.println("Amusement park runs");
		System.out.println("---------------------");
	}
	
}
