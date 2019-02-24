package com.structural.test;

import com.structural.adapter.*;
import org.junit.Test;

public class AdapterTest {

    @Test
    public void canMakeFishRun(){
        AnimalClient client = new AnimalClient();
        client.addAnimal(new Man());
        client.addAnimal(new Dog());
        Fish fish = new Fish();
        client.addAnimal(new FishAdapter(fish));
        client.run();
    }
}