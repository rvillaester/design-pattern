package com.creational.objectpool;

/**
 * Just assume this is a very expensive resource to create
 * like DB connection or SSH connection
 */
public class ExpensiveResource {

    public ExpensiveResource(){
        System.out.println("A very ExpensiveResource was created");
    }

    public void run() {
        System.out.println("Running ........");
    }
}
