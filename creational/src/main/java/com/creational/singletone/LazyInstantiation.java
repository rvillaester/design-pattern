package com.creational.singletone;

public class LazyInstantiation {

    private static LazyInstantiation instance;

    private LazyInstantiation(){}

    public static LazyInstantiation getInstance(){
        if(instance == null){
            synchronized (LazyInstantiation.class){
                if(instance == null){
                    instance = new LazyInstantiation();
                }
            }
        }
        return instance;
    }
}
