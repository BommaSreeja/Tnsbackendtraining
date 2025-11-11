package com.avn.tns.Interface;

public interface Bank {
    void deposit(int amount);
    void withdraw(int amount);
    double balance = 1000;
    int DEPOSIT_LIMIT = 25000;
    int WITHDRAW_LIMIT = 1000;

    default void greet() {
        System.out.println("Welcome customer");
    }

    static void info() {
        System.out.println("UPI credit payments are accepted");
    }
}