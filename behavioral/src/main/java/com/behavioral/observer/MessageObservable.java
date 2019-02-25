package com.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MessageObservable {

    public List<MessageObserver> observers;

    public MessageObservable(){
        this.observers = new ArrayList<>();
    }

    public void addObserver(MessageObserver observer){
        this.observers.add(observer);
    }

    public void removeObserver(MessageObserver observer){
        this.observers.remove(observer);
    }

    public void messageArrive(String message){
        for (MessageObserver observer : observers) {
            observer.sendMessage(message);
        }
    }
}
