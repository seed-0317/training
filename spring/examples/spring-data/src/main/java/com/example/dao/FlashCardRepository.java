package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.FlashCard;

@Repository
public interface FlashCardRepository extends JpaRepository<FlashCard, Integer> {
	FlashCard findFlashCardByQuestion(String question);
}
