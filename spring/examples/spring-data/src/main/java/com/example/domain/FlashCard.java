package com.example.domain;

import javax.persistence.*;

@Entity
@Table(name="flash_card")
public class FlashCard {
	
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="flashCardSequence")
    @SequenceGenerator(allocationSize=1, name="flashCardSequence", sequenceName="FLASH_CARD_SEQUENCE")
	@Column(name="fc_id")
	private Integer id;
	
	@Column(name="fc_question")
	private String question;
	
	@Column(name="fc_answer")
	private String answer;
	
	
	
	public FlashCard(){}
	
	public FlashCard(String question, String answer) {
		super();
		this.question = question;
		this.answer = answer;
	}
	public FlashCard(Integer id, String question, String answer) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlashCard other = (FlashCard) obj;
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "FlashCard [id=" + id + ", question=" + question + ", answer=" + answer + "]";
	}
	
}