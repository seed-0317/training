package com.example.dao;

import com.example.domain.FlashCard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DaoImpl implements Dao {

    @Override
    public void createFlashCard(FlashCard flashcard) {
        try(Connection connection = ConnectionFactory.createConnection();){

            PreparedStatement statement = connection.prepareStatement("insert into flash_card(fc_question, fc_answer) values(?, ?)");
            statement.setString(1, flashcard.getQuestion());
            statement.setString(2, flashcard.getAnswer());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<FlashCard> retrieveFlashCards() {
        try(Connection connection = ConnectionFactory.createConnection();){

            PreparedStatement statement = connection.prepareStatement("select * from flash_card");

            ResultSet resultset = statement.executeQuery();

            while(resultset.next()) {
                int id = resultset.getInt("fc_id");
                String question = resultset.getString("fc_question");
                String answer = resultset.getString("fc_answer");

                System.out.println(id + " - " + question + " - " + answer);

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
