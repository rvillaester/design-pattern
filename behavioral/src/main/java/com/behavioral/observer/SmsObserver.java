package com.behavioral.observer;

public class SmsObserver implements MessageObserver{

    @Override
    public void sendMessage(String message) {
        System.out.println(String.format("Sending message \"%s\" via SMS", message));
    }
}