package com.example.main;

import com.example.dao.Dao;
import com.example.dao.DaoImpl;
import com.example.domain.FlashCard;

public class MyMain {
    public static void main(String[] args) {

        FlashCard flashcard = new FlashCard("Do I know JDBC?", "Absolutely!");

        Dao dao = new DaoImpl();

//        dao.createFlashCard(flashcard);
        dao.retrieveFlashCards();
    }
}
