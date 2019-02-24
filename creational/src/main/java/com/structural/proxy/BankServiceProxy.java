package com.structural.proxy;

/**
 * Add transactional functionality
 */
public class BankServiceProxy implements BankService {

    private BankServiceImpl bankServiceImpl = new BankServiceImpl();

    @Override
    public void deposit(String accountNumber, int amount) {
        System.out.println("Begin transaction");
        try {
            bankServiceImpl.deposit(accountNumber, amount);
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Rollback transaction");
            return;
        }
        System.out.println("Commit Transaction");
    }
}