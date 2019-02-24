package com.structural.adapter;

public class FishAdapter implements Animal{

    private Fish fish;

    public FishAdapter(Fish fish){
        this.fish = fish;
    }

    @Override
    public void run() {
        fish.swim();
    }
}
