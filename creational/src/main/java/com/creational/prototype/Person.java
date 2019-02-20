package com.creational.prototype;

import lombok.Data;

@Data
public class Person implements Prototype{

    private int id;
    private String name;
    private String gender;

    public Person(){}

    public Person(int id, String name, String gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public Prototype createCopy() {
        return new Person(this.id, this.name, this.gender);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Id: ");
        builder.append(id);
        builder.append(" Name: ");
        builder.append(name);
        builder.append(" Gender: ");
        builder.append(gender);
        return builder.toString();
    }
}
