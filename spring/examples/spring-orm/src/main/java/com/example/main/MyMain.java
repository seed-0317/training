package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.domain.FlashCard;
import com.example.service.BusinessLogic;

public class MyMain {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		BusinessLogic businessLogic = (BusinessLogic) applicationContext.getBean("businessLogicImpl");
		
		FlashCard flashCard = businessLogic.updateAnswer(26, "Spring ORM to the rescue!");
		System.out.println(flashCard);
		
		
	}
}
