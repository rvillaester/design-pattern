package com.behavioral.observer;

public class EmailObserver implements MessageObserver{

    @Override
    public void sendMessage(String message) {
        System.out.println(String.format("Sending message \"%s\" via Email", message));
    }
}