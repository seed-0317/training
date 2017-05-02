package com.example.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.Dao;
import com.example.domain.FlashCard;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/test/resources/test-beans.xml" })
@Transactional
public class DaoTest {
	
	@Autowired
	private Dao dao;
	
	@Test
	public void testGetFlashCard() {
		FlashCard flashCard = dao.getFlashCard(1);
		System.out.println(flashCard);
	}
	
	@Test
	public void testGetAllFlashCards() {
		List<FlashCard> flashCards = dao.getAllFlashCards();
		System.out.println(flashCards);
	}
	
	@Test
	public void testUpdateFlashCard() {
		FlashCard flashCard = dao.getFlashCard(1);
		flashCard.setAnswer("dog");
		System.out.println(flashCard);
		dao.updateFlashCard(flashCard);
		System.out.println(flashCard);
		
	}
	
	@Test
	public void testGetAllFlashCards2() {
		List<FlashCard> flashCards = dao.getAllFlashCards();
		System.out.println(flashCards);
	}
	
	
}
