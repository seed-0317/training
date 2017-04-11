package com.example.dao;

import com.example.domain.BankUser;

public interface Dao {
    void saveCustomer(BankUser user);
    BankUser getCustomer();
}
