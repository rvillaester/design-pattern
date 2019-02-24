package com.creational.builder;

public class ApplianceBuilder {

    public ApplianceItems getCrtTvAndLargeRef(){
        ApplianceItems items = new ApplianceItems();
        items.addItem(new CRTTelevision());
        items.addItem(new LargeRefrigator());
        return items;
    }

    public ApplianceItems get2LedTvAndMediumRef(){
        ApplianceItems items = new ApplianceItems();
        items.addItem(new LEDTelevision());
        items.addItem(new LEDTelevision());
        items.addItem(new MediumRefrigator());
        return items;
    }

    // add more variations here
    // in real life, appliance creation should be dynamic based on some parameters for example
}
