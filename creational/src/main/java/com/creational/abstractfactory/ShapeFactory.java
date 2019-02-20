package com.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeType type) {
        Shape shape = null;
        switch (type){
            case CIRLE:
                shape = new Cirle();
                break;
            case SQUARE:
                shape = new Square();
                break;
            case TRIANGLE:
                shape = new Triangle();
                break;
            default:
                break;
        }
        return shape;
    }

    @Override
    public ArithmeticOperation getOperation(OperationType type) {
        return null;
    }
}
