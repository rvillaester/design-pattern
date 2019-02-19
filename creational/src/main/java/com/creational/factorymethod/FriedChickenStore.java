package com.creational.factorymethod;

public abstract class FriedChickenStore {

    public abstract double getPricePerPiece();

    public double calculateBill(int pieces){
        return pieces * getPricePerPiece();
    }

}
