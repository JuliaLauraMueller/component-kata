package com.codurance.adp.bank;

public interface BankApplication {
    void depositFunds(BankApplication ba, String username, double amount);

    double getBalance(String accountNumber);

    double getUserBalance(String accountNumber);

    boolean exists(String username);
}