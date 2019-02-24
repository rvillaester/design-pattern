package com.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class AnimalClient {

    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }

    public void run(){
        for (Animal animal : animals) {
            animal.run();
        }
    }
}
