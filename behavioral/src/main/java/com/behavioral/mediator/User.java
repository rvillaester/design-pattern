package com.behavioral.mediator;

public class User {

    private SmsMediator mediator;
    private String name;

    public User(SmsMediator mediator, String name){
        this.mediator = mediator;
        this.mediator.registerUser(this);
        this.name = name;
    }

    public User(String name){
        this.name = name;
    }

    public void sendMessage(String message){
        System.out.println(String.format("%s is sending message = %s", name, message));
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message, User from){
        System.out.println(String.format("%s received message = %s from %s", this.name, message, from.getName()));
    }

    public String getName() {
        return name;
    }

    public SmsMediator getMediator() {
        return mediator;
    }

    public void setMediator(SmsMediator mediator) {
        this.mediator = mediator;
    }
}
