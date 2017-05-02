package com.example.main;

import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;

import com.example.domain.FlashCard;
import com.example.service.BusinessLogic;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MyMain {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		BusinessLogic businessLogic = (BusinessLogic) applicationContext.getBean("businessLogicImpl");
		
		/*
		 * Example 1
		 */
//		FlashCard flashCard = businessLogic.getRandomFlashCard();
//		System.out.println(flashCard);
		
		/*
		 * Example 2
		 */
//		System.out.println(businessLogic.getFlashCardByQuestion("What is life?"));
		
		/*
		 * Example 3
		 */
//		Page<FlashCard> page = businessLogic.getFlashCardPage(0, 4);
//		new ObjectMapper().writerWithDefaultPrettyPrinter().writeValue(System.out, page);
		
		
		
		
		
	}
}
