package com.assignment;

public interface Account {
    double getBalance();

    boolean isOverDraftAvailable();

    void credit(Double dbl);
}
