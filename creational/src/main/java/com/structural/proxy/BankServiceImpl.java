package com.structural.proxy;

public class BankServiceImpl implements BankService {

    @Override
    public void deposit(String accountNumber, int amount) {
        System.out.println("Checking and getting the account by account number");
        System.out.println("Checking if account is active");
        System.out.println("Checking if valid amount");
        if(amount <= 0){
            throw new RuntimeException("Error: Invalid Amount");
        }
        System.out.println("Adding a deposit record on the deposit table");
        System.out.println("Updating account balance");
        System.out.println("Sending notification");
    }
}
