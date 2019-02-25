package com.behavioral.strategy;

public class Spanish implements SayHiStrategy {

    @Override
    public void sayHi() {
        System.out.println("Hola");
    }
}
