package com.structural.adapter;

public class Dog implements Animal {
    @Override
    public void run() {
        System.out.println("Dog runs using 4 legs");
    }
}
