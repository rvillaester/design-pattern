package com.behavioral.strategy;

public class Context {

    private SayHiStrategy strategy;

    public Context(SayHiStrategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(){
        strategy.sayHi();
    }
}
