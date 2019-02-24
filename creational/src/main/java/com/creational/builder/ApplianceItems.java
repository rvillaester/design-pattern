package com.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class ApplianceItems {

    private List<Appliance> items = new ArrayList<>();

    public void addItem(Appliance appliance){
        this.items.add(appliance);
    }

    public double getTotalPrice(){
        double price = 0;
        for (Appliance item : items) {
            price += item.price();
        }
        return price;
    }

    public void showItems(){
        for (Appliance item : items) {
            System.out.println(item.name());
        }
    }
}
