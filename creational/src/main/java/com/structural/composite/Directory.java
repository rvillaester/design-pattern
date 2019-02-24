package com.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements File {
    private String name;
    private List<File> files = new ArrayList<>();

    public Directory(String name){
        this.name = name;
    }

    public void addChild(File file){
        this.files.add(file);
    }

    @Override
    public void traverse() {
        System.out.println(String.format("Directory: %s", name));
        for (File file : files) {
            file.traverse();
        }
    }
}
