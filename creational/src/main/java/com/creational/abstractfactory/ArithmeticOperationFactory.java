package com.creational.abstractfactory;

public class ArithmeticOperationFactory extends AbstractFactory {

    @Override
    public ArithmeticOperation getOperation(OperationType type) {
        ArithmeticOperation operation = null;
        switch (type){
            case ADD:
                operation = new AdditionOperation();
                break;
            case MINUS:
                operation = new SubtractionOperation();
                break;
            case MULTIPLY:
                operation = new MultiplicationOperation();
                break;
            case DIVIDE:
                operation = new DivisionOperation();
                break;
            default:
                break;
        }
        return operation;
    }

    @Override
    public Shape getShape(ShapeType type) {
        return null;
    }
}
