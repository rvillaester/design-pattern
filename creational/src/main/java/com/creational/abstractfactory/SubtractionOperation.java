package com.creational.abstractfactory;

public class SubtractionOperation implements ArithmeticOperation {

    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}
