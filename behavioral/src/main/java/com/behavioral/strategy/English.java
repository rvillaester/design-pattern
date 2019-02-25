package com.behavioral.strategy;

public class English implements SayHiStrategy {

    @Override
    public void sayHi() {
        System.out.println("Hi");
    }
}
