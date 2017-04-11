package com.example.domain;

import com.example.dao.Dao;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class DaoImpl implements Dao {

    private static File file = new File("src/main/resources/customer.json");

    @Override
    public void saveCustomer(BankUser user) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(file, user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Override
    public BankUser getCustomer() {
        ObjectMapper mapper = new ObjectMapper();

        BankUser user = null;
        try {
            user = mapper.readValue(file, BankUser.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return user;
    }











    public static void main(String[] args) {


        Dao dao = new DaoImpl();

        BankUser user = dao.getCustomer();

        System.out.println(user);

    }

}
