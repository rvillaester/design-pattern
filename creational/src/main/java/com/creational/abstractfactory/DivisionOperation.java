package com.creational.abstractfactory;

public class DivisionOperation implements ArithmeticOperation {

    @Override
    public double calculate(double a, double b) {
        return a / b;
    }
}
