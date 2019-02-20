package com.creational.abstractfactory;

public class FactoryCreator {

    public static AbstractFactory getFactory(FactoryType type){
        AbstractFactory factory = null;
        switch (type){
            case SHAPE:
                factory = new ShapeFactory();
                break;
            case ARITHMETIC_OPERATION:
                factory = new ArithmeticOperationFactory();
                break;
            default:
                break;
        }
        return factory;
    }
}
