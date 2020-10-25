package com.codurance.adp.user;

import com.codurance.adp.account.AccountHolder;
import com.codurance.adp.bank.BankApplication;

public class UserDetails extends AccountHolder
        implements BankApplication {
    public synchronized double getUserBalance(
            String accountNumber) {
        // Use a method of AccountHolder to get the account balance
        return getBalance(accountNumber);
    }

    public boolean exists(String username) {
        // Check whether user exists
        return true;
    }
}