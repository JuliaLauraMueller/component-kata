package com.codurance.adp.user;

import com.codurance.adp.account.AccountHolder;

public class UserDetails extends AccountHolder {

    public synchronized double getUserBalance(String accountNumber) {
        // Use a method of AccountHolder to get the account balance
        return getBalance(accountNumber);
    }
}
