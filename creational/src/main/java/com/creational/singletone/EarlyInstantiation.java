package com.creational.singletone;

public class EarlyInstantiation {

    private static EarlyInstantiation instance = new EarlyInstantiation();

    private EarlyInstantiation(){}

    public static EarlyInstantiation getInstance(){
        return instance;
    }
}
