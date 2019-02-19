package com.creational.factorymethod;

public class FriedChickenStoreFactory {

    public static FriedChickenStore getFriedChickenStore(StoreType type){
        FriedChickenStore store = null;
        switch (type){
            case JOLLIBEE:
                store = new Jollibee();
                break;
            case KENNYROGERS:
                store = new KennyRogers();
                break;
            case MCDONALDS:
                store = new McDonalds();
                break;
            default:
                break;
        }
        return store;
    }
}
