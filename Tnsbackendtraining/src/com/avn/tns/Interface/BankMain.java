package com.avn.tns.Interface;

public class BankMain {
    public static void main(String[] args) {
        Bank obj = new BankImpl();
        obj.deposit(2300);
        obj.withdraw(1000);
    }
}
