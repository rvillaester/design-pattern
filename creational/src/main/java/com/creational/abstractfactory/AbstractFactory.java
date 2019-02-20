package com.creational.abstractfactory;

public abstract class AbstractFactory {
    public abstract ArithmeticOperation getOperation(OperationType type);
    public abstract Shape getShape(ShapeType type);
}
