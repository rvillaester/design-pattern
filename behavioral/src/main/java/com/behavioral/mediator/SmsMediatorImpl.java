package com.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SmsMediatorImpl implements SmsMediator {

    private List<User> users;

    public SmsMediatorImpl(){
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User receiver : users) {
            if(sender != receiver) {
                receiver.receiveMessage(message, sender);
            }
        }
    }

    @Override
    public void registerUser(User user) {
        users.add(user);
        if(user.getMediator() == null){
            user.setMediator(this);
        }
    }
}
