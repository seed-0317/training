package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.Dao;
import com.example.domain.FlashCard;

@Service
public class BusinessLogicImpl implements BusinessLogic {
	
	@Autowired
	private Dao dao;
	
	@Override
	@Transactional(readOnly=false, isolation=Isolation.READ_COMMITTED)
	public FlashCard updateAnswer(Integer id, String newAnswer) {
		FlashCard flashCard = dao.getFlashCard(id);
		flashCard.setAnswer(newAnswer);
		dao.updateFlashCard(flashCard);
		return flashCard;
	}

}
