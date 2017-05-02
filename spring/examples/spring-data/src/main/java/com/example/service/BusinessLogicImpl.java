package com.example.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.FlashCardRepository;
import com.example.domain.FlashCard;

@Service
@Transactional
public class BusinessLogicImpl implements BusinessLogic {
	
	@Autowired
	private FlashCardRepository dao;
	
	@Override
	public FlashCard getRandomFlashCard() {
		
		List<FlashCard> flashCards = dao.findAll();
		Random random = new Random();
		int index = random.nextInt(flashCards.size());
		return flashCards.get(index);
		
	}

	@Override
	public FlashCard getFlashCardByQuestion(String question) {
		return dao.findFlashCardByQuestion(question);
	}

	@Override
	public Page<FlashCard> getFlashCardPage(int page, int size) {
		Pageable pageable = new PageRequest(page, size);
		return dao.findAll(pageable);
	}
	
}
