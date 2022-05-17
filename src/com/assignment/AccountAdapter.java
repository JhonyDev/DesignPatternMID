package com.assignment;

public class AccountAdapter {
    OffshoreAccount account;

    public AccountAdapter(OffshoreAccount account) {
        this.account = account;
    }

    public double getBalance() {
        return account.getOffshoreBalance();
    }
}
