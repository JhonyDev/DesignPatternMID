package com.assignment;

public abstract class AbstractAccount implements Account {

    double balance;
    boolean isOverDraftAvailable;

    public AbstractAccount(double balance) {
        this.balance = balance;
    }

    public void setOverDraftAvailable(boolean overDraftAvailable) {
        isOverDraftAvailable = overDraftAvailable;
    }

    @Override
    public String toString() {
        return "AbstractAccount{" +
                "balance=" + balance +
                ", isOverDraftAvailable=" + isOverDraftAvailable +
                '}';
    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public boolean isOverDraftAvailable() {
        return false;
    }

    @Override
    public void credit(Double dbl) {

    }
}
