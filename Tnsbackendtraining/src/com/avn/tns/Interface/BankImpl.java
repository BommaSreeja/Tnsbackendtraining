package com.avn.tns.Interface;

public class BankImpl implements Bank {
    private double balance;

    public BankImpl() {
        this.balance = Bank.balance;
    }

    @Override
    public void deposit(int amount) {
        if (amount <= DEPOSIT_LIMIT) {
            balance += amount;
            System.out.println("The balance is " + balance);
        } else {
            System.out.println("Deposit limit exceeded");
        }
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= WITHDRAW_LIMIT && balance >= amount) {
            balance -= amount;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Insufficient balance or withdrawal limit exceeded");
        }
    }
}
