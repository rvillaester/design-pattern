package com.behavioral.command;

/**
 * acts as the receiver
 */
public class RemoteControl {

    public void turnOn(){
        System.out.println("Turning on");
    }

    public void turnOff(){
        System.out.println("Turning off");
    }

    public void volumeUp(int level){
        System.out.println(String.format("Increasing volume by %d", level));
    }

    public void volumeDown(int level){
        System.out.println(String.format("Decreasing volume by %d", level));
    }
}
