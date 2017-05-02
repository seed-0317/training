package com.example.dao;

import java.util.List;

import com.example.domain.FlashCard;

public interface Dao {
	
	List<FlashCard> getAllFlashCards();
	FlashCard getFlashCard(Integer id);
	FlashCard updateFlashCard(FlashCard flashCard);
	
	
	
}
