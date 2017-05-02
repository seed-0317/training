package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.domain.FlashCard;

@Component
public class DaoImpl implements Dao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<FlashCard> getAllFlashCards() {
		return sessionFactory.getCurrentSession().createCriteria(FlashCard.class).list();
	}
	
	@Override
	public FlashCard getFlashCard(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		return (FlashCard) session.get(FlashCard.class, id);
	}

	@Override
	public FlashCard updateFlashCard(FlashCard flashCard) {
		Session session = sessionFactory.getCurrentSession();
		session.update(flashCard);
		return flashCard;
	}
	
}
