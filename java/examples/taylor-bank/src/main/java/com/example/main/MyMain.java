package com.example.main;

import com.example.dao.Dao;
import com.example.domain.BankUser;
import com.example.domain.DaoImpl;

public class MyMain {

    public static void main(String[] args) {

        Dao dao = new DaoImpl();
        BankUser user = dao.getCustomer();

        System.out.println("Hi " + user.getName());
        System.out.println("Balance: " + user.getBalance());


        user.setBalance(700);





        dao.saveCustomer(user);
    }

}
