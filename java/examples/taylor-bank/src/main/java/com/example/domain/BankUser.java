package com.example.domain;

public class BankUser {
    private String name;
    private double balance;

    public BankUser() {}

    public BankUser(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankUser bankUser = (BankUser) o;

        if (Double.compare(bankUser.balance, balance) != 0) return false;
        return name != null ? name.equals(bankUser.name) : bankUser.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "BankUser{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
