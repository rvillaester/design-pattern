package com.behavioral.strategy;

public class Filipino implements SayHiStrategy {

    @Override
    public void sayHi() {
        System.out.println("Kamusta");
    }
}
