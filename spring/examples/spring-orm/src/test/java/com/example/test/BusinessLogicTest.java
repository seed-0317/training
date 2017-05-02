package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.example.dao.Dao;
import com.example.domain.FlashCard;
import com.example.service.BusinessLogic;
import com.example.service.BusinessLogicImpl;

@RunWith(MockitoJUnitRunner.class)
public class BusinessLogicTest {
	
	@Mock
	private Dao dao;
	
	@InjectMocks
	private BusinessLogic businessLogic = new BusinessLogicImpl();
	
	@Test
	public void testUpdateAnswer() {
		
		//set up
		int fcId = 1;
		String fcQuestion = "some question";
		String fcAnswer = "some answer";
		FlashCard flashCard = new FlashCard(fcId, fcQuestion, fcAnswer);
		
		//define behavior for mock object
		when(dao.getFlashCard(fcId)).thenReturn(flashCard);
		
		//define expected result
		String newAnswer = "dog";
		FlashCard expected = new FlashCard(fcId, fcQuestion, newAnswer);
		
		//call method
		FlashCard actual = businessLogic.updateAnswer(fcId, newAnswer);
		
		//test result against expected
		assertEquals(expected, actual);
		
	}
	
	/*
	 * Without Mockito: I need DaoImpl to be working and I am hoping that there is a FlashCard with id 26 in the database 
	 */
	/*
	@Test
	public void testUpdateAnswer2() {
		
		assertEquals("dog", businessLogic.updateAnswer(26, "dog").getAnswer());
		
	}
	*/
	
}
