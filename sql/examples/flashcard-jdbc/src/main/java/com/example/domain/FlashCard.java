package com.example.domain;

public class FlashCard {
    private int id;
    private String question;
    private String answer;

    public FlashCard() {}

    public FlashCard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public FlashCard(int id, String question, String answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlashCard flashCard = (FlashCard) o;

        if (id != flashCard.id) return false;
        if (question != null ? !question.equals(flashCard.question) : flashCard.question != null) return false;
        return answer != null ? answer.equals(flashCard.answer) : flashCard.answer == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FlashCard{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
