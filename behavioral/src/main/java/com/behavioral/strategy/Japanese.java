package com.behavioral.strategy;

public class Japanese implements SayHiStrategy {

    @Override
    public void sayHi() {
        System.out.println("Kon'nichiwa");
    }
}
