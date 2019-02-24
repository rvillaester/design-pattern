package com.structural.composite;

public class RawFile implements File {
    private String name;

    public RawFile(String name){
        this.name = name;
    }

    @Override
    public void traverse() {
        System.out.println(String.format("Raw File: %s", name));
    }
}
