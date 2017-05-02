package com.example.service;

import com.example.domain.FlashCard;

public interface BusinessLogic {
	
	FlashCard updateAnswer(Integer id, String newAnswer);
	
}
