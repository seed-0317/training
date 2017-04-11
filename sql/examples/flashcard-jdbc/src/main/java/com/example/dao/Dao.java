package com.example.dao;

import com.example.domain.FlashCard;

import java.util.List;

public interface Dao {
    void createFlashCard(FlashCard flashcard);
    List<FlashCard> retrieveFlashCards();
}
