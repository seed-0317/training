package com.example.service;

import org.springframework.data.domain.Page;

import com.example.domain.FlashCard;

public interface BusinessLogic {
	
	FlashCard getRandomFlashCard();
	FlashCard getFlashCardByQuestion(String question);
	Page<FlashCard> getFlashCardPage(int page, int size);
	
}
